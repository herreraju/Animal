
public class Pop extends BadSong
	{
	public Pop()
		{
		genre = "pop";
		improv = (ImprovBehavior) new NoImprov();
		}
	public void individualAspects()
		{
		DanceUrge();
		}
	public void DanceUrge()
		{
		System.out.println("There is a sudden urge to dance.");
		}
	}
