/*
 * Sean Fauteaux
 * 1/25/2021
 * CSCD212
 * Observer Pattern Assignment
 * 
 * TestSauronEye is the driver file that creates an EyeOfSauron, as well as
 * BadGuys to view the eye. When the eye sees new enemies, it updates all bad guys that
 * are observing it. Each bad guy that is observing will print that it can now see
 * the new enemies list as well. 
 */
public class TestSauronEye{
	public static void main(String[] args) {
		EyeOfSauron eye = new EyeOfSauron();
		
		eye.setEnemies(9, 10, 11, 4); //no observers, so this won't print anything
		
        BadGuy saruman = new BadGuy(eye, "Saruman");
        BadGuy witchKing= new BadGuy(eye, "Witch King");
        
        eye.setEnemies(1, 2, 1, 0); //now there are 2 observers, both observers will show that they have updated
        
        saruman.defeated(); //RIP saruman, removed from list of observers 
        
        eye.setEnemies(4, 5, 2, 3); //now there's only 1 observer, only 1 update will be shown
        
        witchKing.defeated(); //RIP witch king, removed from list of observers
        
        eye.setEnemies(9, 10, 11, 4); //no observers, so this won't print anything
	}
	
}