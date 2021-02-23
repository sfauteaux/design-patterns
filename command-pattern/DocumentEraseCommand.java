/*
 * Erase command can either erase based on a given string that is to be removed, 
 * or by being given an index number and directly removing the text at that index. 
 */
public class DocumentEraseCommand implements Command{
	private Document editableDoc;
	private String text;
	
	private int index;
	
	//Erase constructor when given string to remove
	public DocumentEraseCommand(Document doc, String txt) {
		editableDoc = doc;
		text = txt;
		index = editableDoc.getLine(text); //used for undo
		//if getLine returns -1, that means the text was not found and nothing was removed, so undo will do nothing iff index == -1
		editableDoc.Erase(text);
	}
	
	//Erase constructor when given an index to remove 
	public DocumentEraseCommand(Document doc, int index) {
		editableDoc = doc;
		this.index = index;
		editableDoc.Erase(index);
	}
	
	//Undo will write the text back to the document.
	public void undo() {
		if(index != -1) {
			editableDoc.insert(text, index);
		}
	}
	
	//Redo will call Erase function again. Calls based on index to avoid additional runtime costs of finding the text line again
	public void redo() {
		editableDoc.Erase(index);
	}
}