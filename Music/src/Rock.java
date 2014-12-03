
public class Rock extends GoodSong
	{
	public Rock()
		{
		genre = "rock";
		improv = (ImprovBehavior) new CanImprov();
		}
	public void individualAspects()
		{
		RockOn();
		}
	@Override
	public void changeChords()
		{
		super.changeChords();
		for (int w = 0; w < chords.size(); w++) 
			{
			chords.set(w, (chords.get(w).substring(0,1) + "5"));
			}
		}
	public void RockOn()
		{
		System.out.println("There is a sudden urge to headbang.");
		}
	}
