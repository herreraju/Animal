import java.util.ArrayList;
public abstract class Song 
	{
	protected String genre;
	protected char key;
	protected ArrayList<String> chords = new ArrayList<String>();
	protected ImprovBehavior improv;
	public abstract void playDrums();
	public abstract void individualAspects();
	public void letsPlay() 
		{
		System.out.println("Let's play a " + genre + " song.");
		}
	public void playMelody()
		{
		System.out.println("A smooth, sweet melody plays over the chord changes.");
		}
	public void playChordChanges()
		{
		for (String thisOneChord : chords) 
			{
			System.out.println("The band plays a " + thisOneChord + " chord.");
			}
		}
	public void changeChords()
		{
		switch(key)
			{
			case 'm':
				{
				chords.add("Am");
				chords.add("C");
				chords.add("F");
				chords.add("Dm");
				break;
				}
			case 'M':
				{
				chords.add("C");
				chords.add("D");
				chords.add("G");
				break;
				}
			default:
				{
				chords.add("nonexistant");
				}
			}
		}
	}
