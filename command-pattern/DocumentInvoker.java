/*
 * Document Invoker keeps track of all commands that are called on the document so that 
 * they can be later undone/redone if needed by calling the Undo/Redo commands on the invoker. 
 * 
 * Stores the document and arraylist of commands performed 
 */

import java.util.ArrayList;

public class DocumentInvoker {
	private ArrayList<Command> commands = new ArrayList<Command>();
	private Document currentdoc;
	
	//Basic constructor, creates document and names it with given String name
	public DocumentInvoker(String name) {
		currentdoc = new Document(name);
	}
	
	//Redo/Undo methods take int level of command to be redone/undone and then undo/redo those commands
	public void Redo(int level) {
		Command tmp = commands.get(level);
		System.out.println("---- Redo level " + level);
		tmp.redo();
	}
	
	public void Undo(int level) {
		Command tmp = commands.get(level);
		System.out.println("---- Undo level " + level);
		tmp.undo();
	}
	
	//Each of these commands create a new Command object and perform the 
	public void Write(String text) {
		DocumentWriteCommand cmd = new DocumentWriteCommand(currentdoc,text);
		commands.add(cmd);
	}
	
	//Erase using text
	public void Erase(String text) {
		DocumentEraseCommand cmd = new DocumentEraseCommand(currentdoc,text);
		commands.add(cmd);
	}
	//Erase using line number
	public void Erase(int i) {
		DocumentEraseCommand cmd = new DocumentEraseCommand(currentdoc,i);
		commands.add(cmd);
	}
	//Bold using line number
	public void Bold(int line) {
		DocumentBoldCommand cmd = new DocumentBoldCommand(currentdoc,line);
		commands.add(cmd);
	}
	//Remove bold using line number
	public void RemoveBold(int line) {
		DocumentRemoveBoldCommand cmd = new DocumentRemoveBoldCommand(currentdoc,line);
		commands.add(cmd);
	}
	//Prints the document 
	public String Read() {
		return currentdoc.Read();
	}
}