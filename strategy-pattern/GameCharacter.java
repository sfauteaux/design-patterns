public abstract class GameCharacter {
	GuitarType guitarType = new GibsonFlyingV();
	SoloBehavior soloBehavior = new SmashGuitar();
	String name;
	
	/*
	 * Default constructor, doesn't change the default values
	 * for GuitarType or SoloBehavior
	 */
	public GameCharacter() {}
	
	/*
	 * Constructor when given just GuitarType
	 */
	public GameCharacter(GuitarType gt) {
		guitarType = gt;
	}
	/*
	 * Constructor when given just SoloBehavior
	 */
	public GameCharacter(SoloBehavior sb) {
		soloBehavior = sb;
	}
	/*
	 * Constructor when given both values
	 */
	public GameCharacter(GuitarType gt, SoloBehavior sb) {
		guitarType = gt;
		soloBehavior = sb;
	}
	
	//plays solo
	public void playSolo() {
		System.out.print(name);
		soloBehavior.solo();
	}
	
	//sets a new solo
	public void setSolo(SoloBehavior sb) {
		soloBehavior = sb;
	}
	
	//plays guitar
	public void playGuitar() {
		System.out.print(name);
		guitarType.guitar();
	}
	
	//sets new guitar type
	public void setGuitar(GuitarType gt) {
		guitarType = gt;
	}
	
	//sets name
	public void setName(String n) {
		name = n;
	}
}