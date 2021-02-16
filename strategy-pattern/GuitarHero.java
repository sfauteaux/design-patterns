/*
 * Sean Fauteaux
 * 1/19/2021, CSCD 212
 * Strategy Design
 * 
 * This code follows the strategy design pattern and allows
 * the user to choose whichever character they want to play as,
 * as well as choosing whatever guitar and solo they want.
 * Those values can also be changed afterwards
 */

public class GuitarHero {
    public static void main(String[] args) {
    	
    	//Initial player selection. Each character can be constructed with 
    	//default values, different guitar, or different guitar and solo
        GameCharacter player1 = new Slash(); 
        GameCharacter player2 = new Hendrix();
        GameCharacter player3 = new Angus(new FenderTelecaster(), new JumpOffStage());
        
        player1.playGuitar(); 
        player2.playGuitar(); 
        
        player1.playSolo(); 
        player2.playSolo(); 
        
        player3.playGuitar();
        player3.playSolo();
        
        //Code below shows that values can be swapped for each player
        player1.setSolo(new SetFire());
        player1.setGuitar(new GibsonSG());
        
        player2.setSolo(new JumpOffStage());
        player2.setGuitar(new FenderTelecaster());
        
        player1.playSolo();
        player1.playGuitar();
        
        player2.playSolo();
        player2.playGuitar();
        
    }
}