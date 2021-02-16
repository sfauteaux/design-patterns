package holiday_decorations;

public class BallsBlue extends Decorator{

	//constructor
	public BallsBlue(ChristmasTree tree) {
		super(tree);
	}
	
	//return super description plus this description
	public String getDesc() {
		return super.getDesc() + ", Blue Balls";
	}
	
	//return super cost plus this cost
	public int getCost() {
		return super.getCost() + 2;
	}
	
}