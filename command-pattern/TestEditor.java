/*
 * Sean Fauteaux
 * 2/22/2021
 * CSCD 212
 * Command Pattern Assignment
 * 
 * This program allows you to create a document and gives Write, Erase, Bold, and Remove Bold
 * functionality on a line-by-line basis. This TestEditor.java file is based on the required output for 
 * the assignment. 
 */
public class TestEditor{
	public static void main(String[] args) {
		
		DocumentInvoker doc = new DocumentInvoker("message_to_Nancy Ripplinger");
		doc.Write("Stop your messin' around");
		doc.Write("Better think of your future");
		doc.Write("Time you straightened right out");
		doc.Undo(0);
		System.out.println(doc.Read());
		doc.Redo(0);
		System.out.println(doc.Read());

		

	}
}