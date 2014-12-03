
public class GoodSong extends Song
	{
	public GoodSong()
		{
		improv = (ImprovBehavior)new NullImprov();
		genre = "good";
		key = 'm';
		}
	public void playDrums()
		{
		System.out.println("*Passionate drummer plays heart out*");
		}
	public void individualAspects(){}
	
	}
