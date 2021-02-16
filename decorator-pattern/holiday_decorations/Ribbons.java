package holiday_decorations;

public class Ribbons extends Decorator{

	//constructor
	public Ribbons(ChristmasTree tree) {
		super(tree);
	}
	
	//return super description plus this description
	public String getDesc() {
		return super.getDesc() + ", ribbons";
	}
	
	//return super cost plus this cost
	public int getCost() {
		return super.getCost() + 2;
	}
	
}