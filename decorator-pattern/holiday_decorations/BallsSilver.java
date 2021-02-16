package holiday_decorations;

public class BallsSilver extends Decorator{

	//constructor
	public BallsSilver(ChristmasTree tree) {
		super(tree);
	}
	
	//return super description plus this description
	public String getDesc() {
		return super.getDesc() + ", Silver Balls";
	}
	
	//return super cost plus this cost
	public int getCost() {
		return super.getCost() + 3;
	}
	
}