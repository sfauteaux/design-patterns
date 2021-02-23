/*
 * Document object that stores textArray of its contents as well as its name. 
 * DocumentInvoker first receives the commands to store a list of the commands done, then
 * uses the methods in this class to perform the actions. 
 */

import java.util.ArrayList;

public class Document {
	private ArrayList<String> textArray;
	private String name;
	
	//Basic constructor, takes string name as parameter 
	public Document(String name) {
		this.name = name;
		textArray = new ArrayList<String>();
	}
	
	//Adds the given text into the text array
	public void Write(String text) {
		textArray.add(text);
	}
	
	//Searches for the given text in the text array and removes
	//the line if found. 
	public void Erase(String text) {
		for(int i = textArray.size()-1; i< textArray.size();i--) { //starts at the end of the arraylist
			if(textArray.get(i).equals(text)) { //to remove the most recent occurence of the text 
				textArray.remove(i);
			}
		}
	}
	
	//Adds the bold identifiers to beginning and end of line that requires the bold
	public void Bold(int line) {
		String txt = "<b>" + textArray.get(line) + "</b>";
		textArray.set(line, txt);
	}
	
	//Removes the bold identifiers from beginning and end of line
	public void RemoveBold(int line) {
		String txt = textArray.get(line);
		txt = txt.substring(3, txt.length()-4);
		textArray.set(line, txt);
	}
	
	//Removes based on line number rather than finding a string of text
	public void Erase(int line) {
		textArray.remove(line);
	}
	

	public String Read() {
		String txt = "---- Contents of: " + name + " ----\n";
		for(int i = 0; i < textArray.size();i++) {
			txt = txt + i + ":"+ textArray.get(i) + "\n";
		}
		return txt;
	}
	
	//getLine function used for undoing an Erase command 
	public int getLine(String text) {
		for(int i = textArray.size()-1; i< textArray.size();i--) { //starts at the end of the arraylist
			if(textArray.get(i).equals(text)) { //to remove the most recent occurence of the text 
				return i;
			}
		}
		return -1; //returns -1 if not found 
	}
	
	//Used for undoing an erase command
	public void insert(String txt, int line) {
		textArray.add(line, txt);
	}
	
	//Getter for the size of the document. Used for undoing Write command 
	public int getSize() {
		return textArray.size();
	}
	
}