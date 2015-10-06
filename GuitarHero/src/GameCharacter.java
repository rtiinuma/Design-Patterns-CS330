
public abstract class GameCharacter {
	
	Guitar guitarType;
	SoloAct soloType;
	
	public GameCharacter(){
	}
	
	public void playGuitar()
	{
	 guitarType.play();
	}
	
	public void playSolo()
	{
     soloType.perform();
	}
	
	public void changeGuitar( Guitar gt )
	{
	 guitarType = gt;
	}
	
}
