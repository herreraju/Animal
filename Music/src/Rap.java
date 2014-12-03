
public class Rap extends BadSong
	{
	public Rap()
		{
		key = '?';
		genre = "rap";
		improv = (ImprovBehavior) new NoImprov();
		}
	public void individualAspects()
		{
		Flow();
		}
	public void Flow()
		{
		System.out.println("The talented rapper flows like a boss.");
		}
	}
