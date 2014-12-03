import java.util.ArrayList;
import java.util.Iterator;


public class SongRunner 
{
	public static void main(String[] args) 
	{
	ArrayList<Song> collection = new ArrayList<Song>();
	collection.add(new GoodSong());
	collection.add(new BadSong());
	collection.add(new Jazz());
	collection.add(new Rock());
	collection.add(new Pop());
	collection.add(new Rap());
	for(Song g : collection) 
		{
		g.letsPlay();
		g.playMelody();
		g.individualAspects();
		g.playDrums();
		g.changeChords();
		g.playChordChanges();
		g.improv.play();
		System.out.println("");
		System.out.println("");
		System.out.println("");
		}
	}
}
