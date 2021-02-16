/*
 * BadGuy class is the observer that looks at the subject EyeOfSauron
 */

import java.util.Observer;
import java.util.Observable;

public class BadGuy implements Observer{
	private EyeOfSauron eye;
	private String name;
	
	//when EyeOfSauron tells a bad guy that it has been updated,
	//update method gets the array of enemies and prints the enemies it knows about
	public void update() {
		int[] a = eye.getEnemies();
		System.out.printf("%s knows about %d hobbits, %d elves, "
				+ "%d dwarves, and %d men. \n",name, a[0],a[1],a[2],a[3]);
	}
	
	//Constructor for bad guy, attaches to eye of sauron as an observer
	//and sets the name of this bad guy
	public BadGuy(EyeOfSauron eye, String name) {
		this.eye = eye;
		this.eye.attach(this);
		this.name = name;
	}
	
	//When defeated, detaches from the EyeOfSauron so this bad guy
	//no longer receives updates
	public void defeated() {
		this.eye.detach(this);
	}

	//I don't have a use for this method but I was required to have it to get the code to compile
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
}