package holiday_decorations;
/*
 * Decorator class that allows for the holiday decorations to be
 * added to the overall object and decorated 
 */
public class Decorator implements ChristmasTree{

	protected ChristmasTree tree;
	
	//Decorator constructor 
	public Decorator(ChristmasTree tree2) {
		tree = tree2;
	}

	@Override
	public String getDesc() {
		return tree.getDesc();
	}

	@Override
	public int getCost() {
		return tree.getCost();
	}
	
}