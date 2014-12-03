
public class Jazz extends GoodSong
	{
	public Jazz()
		{
		genre = "jazz";
		improv = (ImprovBehavior) new CanImprov();
		}
	public void individualAspects()
		{
		Swing();
		}
	@Override
	public void changeChords()
		{
		super.changeChords();
		super.changeChords();
		for (int w = 0; w < chords.size(); w += 2) 
			{
			chords.set(w, (chords.get(w) + "7"));
			}
		}
	public void Swing()
		{
		System.out.println("The band has a swing to their music.");
		}
	}
