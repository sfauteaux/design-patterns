package holiday_decorations;

public class Ruffles extends Decorator{

	//constructor
	public Ruffles(ChristmasTree tree) {
		super(tree);
	}
	
	//return super description plus this description
	public String getDesc() {
		return super.getDesc() + ", ruffles";
	}
	
	//return super cost plus this cost
	public int getCost() {
		return super.getCost() + 1;
	}
	
}