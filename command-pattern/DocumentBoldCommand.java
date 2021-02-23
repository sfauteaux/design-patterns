/*
 * Command class for the Bold command. Gets called by invoker, 
 * adds Bold markups to a line of text. Basic undo/redo functionality 
 */
public class DocumentBoldCommand implements Command{

	private Document editableDoc;
	private int line;
	
	//Basic constructor that adds the 
	public DocumentBoldCommand(Document doc, int line) {
		editableDoc = doc;
		this.line = line;
		editableDoc.Bold(line);
	}
	
	
	//Basic undo, redo methods that remove/add the bold markups
	public void undo() {
		editableDoc.RemoveBold(line);
	}

	
	public void redo() {
		editableDoc.Bold(line);
	}
	
}