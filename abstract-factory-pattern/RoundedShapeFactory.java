import shape.RoundedRectangle;
import shape.RoundedSquare;
import shape.Shape;

//shape factory for rounded shapes
public class RoundedShapeFactory extends AbstractFactory{

	@Override
	//gets shape type from the main function, creates appropriate shape
	Shape getShape(String type) {
		if(type.equals("Rectangle")) {
			return new RoundedRectangle();
		}
		else if(type.equals("Square")) {
			return new RoundedSquare();
		}
		return null;
	}
	
}