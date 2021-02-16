/*
 * EyeOfSauron class is the subject, stores an int array of enemies
 */
import java.util.*;

public class EyeOfSauron extends Observable{
	private int[] enemies = {0,0,0,0};
	private List<BadGuy> observers = new ArrayList<BadGuy>();
	
	//default constructor
	public EyeOfSauron() {
	}
	
	//constructor for being given an array of enemies
	public EyeOfSauron(int[] e) {
		this.enemies = e;
	}
	
	//returns int array of enemies 
	public int[] getEnemies() {
		return enemies;
	}
	
	//sets new enemies and notifies all observers that the values have been updated
	public void setEnemies(int a, int b, int c, int d) {
		this.enemies[0] = a;
		this.enemies[1] = b;
		this.enemies[2] = c;
		this.enemies[3] = d;
		notifyObservers();
	}
	
	//adds bad guy to list
	public void attach(BadGuy b) {
		observers.add(b);
	}
	
	//removes bad guy from list
	public void detach(BadGuy b) {
		observers.remove(b);
	}
	
	//notifies all observers
	public void notifyObservers() {
		for(BadGuy b: observers) {
			b.update();
		}
	} 
	
}