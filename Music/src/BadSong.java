
public class BadSong extends Song
	{
	public BadSong()
		{
		improv = (ImprovBehavior)new NullImprov();
		genre = "bad";
		key = 'M';
		}
	public void playDrums()
		{
		System.out.println("*Incredibly precise drum machine*");
		}
	public void individualAspects(){}
	}
