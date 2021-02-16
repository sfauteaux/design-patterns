package holiday_decorations;

public class Star extends Decorator{
	
	private int cost;
	private String desc;
	
	//Checks if star already exists on tree, if yes then
	//sets the parameters here to be 0 cost, blank string
	public Star(ChristmasTree tree) {
		super(tree);
		if(super.getDesc().contains(", star")) {
			System.out.println("Tree already has a star, no changes made.");
			cost=0;
			desc = "";
		}
		else {
			cost = 4;
			desc = ", star";
		}
	}
	
	//Returns every detail that's been added to the tree
	public String getDesc() {
		return super.getDesc() + desc;
	}
	
	//Adds all the costs of everything added to the tree
	public int getCost() {
		return super.getCost() + cost;
	}
}