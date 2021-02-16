public class Angus extends GameCharacter{
	
	//default constructor for Angus
	Angus(){
		setName("Angus Young");
	}
	//constructor when given just guitar type
	Angus(GuitarType gt){
		setName("Angus Young");
		setGuitar(gt);
	}
	//constructor when given guitar and solo
	Angus(GuitarType gt, SoloBehavior sb){
		setName("Angus Young");
		setGuitar(gt);
		setSolo(sb);
	}
}