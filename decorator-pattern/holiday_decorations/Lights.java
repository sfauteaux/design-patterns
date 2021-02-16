package holiday_decorations;

public class Lights extends Decorator{

	//constructor
	public Lights(ChristmasTree tree) {
		super(tree);
	}
	
	//return super description plus this description
	public String getDesc() {
		return super.getDesc() + ", lights";
	}
	
	//return super cost plus this cost
	public int getCost() {
		return super.getCost() + 5;
	}
	
}