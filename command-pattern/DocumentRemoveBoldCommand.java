/*
 * Remove bold command goes to the line number that is passed to it and removes the bold
 * markups at that line number
 */
public class DocumentRemoveBoldCommand implements Command {
	private Document editableDoc;
	private int line;
	
	//Remove bold constructor, calls the Remove Bold command for the doc at the specified line number
	public DocumentRemoveBoldCommand(Document doc, int l) {
		editableDoc = doc;
		line = l;
		editableDoc.RemoveBold(line);
	}
	
	//Basic undo/redo functions
	public void undo() {
		editableDoc.Bold(line);
	}
	
	public void redo() {
		editableDoc.RemoveBold(line);
	}
	
	
}