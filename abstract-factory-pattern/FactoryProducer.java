public class FactoryProducer{
	
	//Creates the type of factory needed for our shape.
	//1 for normal, anything else for rounded 
	//method is package protected so it can't be created from outside
	//the source package
	protected static AbstractFactory createFactory(int i) {
		if(i==1) {
			return new ShapeFactory();
		}
		else {
			return new RoundedShapeFactory();
		}
	}
}