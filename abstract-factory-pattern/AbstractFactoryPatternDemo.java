/*
 * Sean Fauteaux
 * 02/08/2021
 * Factory Pattern 1B: Abstract Factory
 * 
 * This program uses the abstract factory method to create
 * different factories based on what type of shape you want
 * to created (normal or rounded), then those factories can be
 * used to created a rectangle or square of your choice
 */
import shape.*;

public class AbstractFactoryPatternDemo{
	
	//Based on the required output, this main function
	//creates a rectangle, square, rounded rectangle, rounded square
	//in that order using Abstract Factories
	public static void main(String[] args) {
		
		//normal factory for unrounded shapes
		AbstractFactory normal = FactoryProducer.createFactory(1);
		Shape rect = normal.getShape("Rectangle");
		Shape square = normal.getShape("Square");
		
		rect.draw();
		square.draw();
		
		AbstractFactory rounded = FactoryProducer.createFactory(0);
		Shape roundRect = rounded.getShape("Rectangle");
		Shape roundSquare = rounded.getShape("Square");
		//we don't have to specify "RoundedSquare" here because the factory is already
		//a rounded shape factory
		
		roundRect.draw();
		roundSquare.draw();
		
	}
}