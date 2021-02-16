package holiday_decorations;

public class LED extends Decorator{

	//constructor
	public LED(ChristmasTree tree) {
		super(tree);
	}
	
	//return super description plus this description
	public String getDesc() {
		return super.getDesc() + ", LEDs";
	}
	
	//return super cost plus this cost
	public int getCost() {
		return super.getCost() + 10;
	}
	
}