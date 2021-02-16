public class Slash extends GameCharacter{
	Slash(){
		setName("Slash");
	}
	//constructor when given just guitar type
	Slash(GuitarType gt){
		setName("Slash");
		setGuitar(gt);
	}
	//constructor when given guitar and solo
	Slash(GuitarType gt, SoloBehavior sb){
		setName("Slash");
		setGuitar(gt);
		setSolo(sb);
	}
}