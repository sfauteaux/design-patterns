import holiday_decorations.*;

/*
 * Sean Fauteaux
 * 2/1/2021
 * CSCD212
 * Decotator Pattern HW
 * 
 * This file is the tester file, it imports all holiday items from
 * the "holiday_decorations" package and uses them to create different 
 * tree decoration options based on the specifications from the assignment
 * page. 
 */
public class TreeTester{
	public static void main(String[] args) {
		//creating a Fraser Fir tree with a star on it already
		ChristmasTree tree = new Star(new FraserFir());
		
		System.out.println(tree.getDesc() + " costs: $" + tree.getCost());
		
		tree = new Star(tree); //this line doesn't change the tree
		
		//Fraser Fir tree with 1 of everything
		tree = new BallsRed(tree);
		tree = new BallsSilver(tree);
		tree = new Ruffles(tree);
		tree = new LED(tree);
		tree = new Lights(tree);
		tree = new Ribbons(tree);
		tree = new BallsBlue(tree);
		
		System.out.println("Tree1: " + tree.getDesc() + " costs: $" + tree.getCost());
		
		
		
		//Creating a blue spruce with ribbons and a star
		ChristmasTree tree2 = new Ribbons(new Star(new BlueSpruce()));
		
		System.out.println("Tree2: " + tree2.getDesc() + " costs: $" + tree2.getCost());
		
		//Creating a Douglas fir with nothing
		ChristmasTree tree3 = new DouglasFir();
		//adding 5 LEDs
		tree3 = new LED(tree3);
		tree3 = new LED(tree3);
		tree3 = new LED(tree3);
		tree3 = new LED(tree3);
		tree3 = new LED(tree3);
		
		System.out.println("Tree3: " + tree3.getDesc() + " costs: $" + tree3.getCost());
	}
}
