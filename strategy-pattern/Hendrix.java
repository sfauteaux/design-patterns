public class Hendrix extends GameCharacter{
	Hendrix(){
		setName("Jimi Hendrix");
	}
	Hendrix(GuitarType gt){
		setName("Jimi Hendrix");
		setGuitar(gt);
	}
	Hendrix(GuitarType gt, SoloBehavior sb){
		setName("Jimi Hendrix");
		setGuitar(gt);
		setSolo(sb);
	}
}