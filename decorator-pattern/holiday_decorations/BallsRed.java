package holiday_decorations;

public class BallsRed extends Decorator{

	//constructor
	public BallsRed(ChristmasTree tree) {
		super(tree);
	}
	
	//return super description plus this description
	public String getDesc() {
		return super.getDesc() + ", Red Balls";
	}
	
	//return super cost plus this cost
	public int getCost() {
		return super.getCost() + 1;
	}
	
}