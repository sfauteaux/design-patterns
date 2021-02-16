import shape.Shape;

//abstract class for the shape and rounded shape factories
public abstract class AbstractFactory{
	abstract Shape getShape(String type);
}