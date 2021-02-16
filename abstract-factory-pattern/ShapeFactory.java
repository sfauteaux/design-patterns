import shape.Rectangle;
import shape.Shape;
import shape.Square;

//Shape factory for non-rounded shapes
public class ShapeFactory extends AbstractFactory{

	@Override
	//gets shape type from the main function, creates appropriate shape
	Shape getShape(String type) {
		if(type.equals("Rectangle")) {
			return new Rectangle();
		}
		else if(type.equals("Square")) {
			return new Square();
		}
		return null;
	}
	
}