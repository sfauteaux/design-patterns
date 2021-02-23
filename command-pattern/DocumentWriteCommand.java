/*
 * Write command takes a string and calls the Document write command to add the string
 * to the document's ArrayList
 */
public class DocumentWriteCommand implements Command {
	private Document editableDoc;
	private String text;
	
	private int index;
	
	//Basic constructor for Write command, invoked by DocInvoker
	//adds the text to the arraylist of the document 
	public DocumentWriteCommand(Document doc, String txt) {
		text = txt;
		editableDoc = doc;
		editableDoc.Write(text);
		index = editableDoc.getSize()-1; //used for undoing 
	}
	
	//Basic undo will erase the last thing that was inserted
	public void undo() {
		editableDoc.Erase(index);
	}

	//Redo rewrites this text at the same index it was previously written
	public void redo() {
		editableDoc.insert(text,index);
	}
}