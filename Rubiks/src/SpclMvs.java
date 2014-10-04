import java.awt.Color;
import java.util.Random;


public class SpclMvs 
{
	public static void solve()
	{
	Mains.sidesArray = new Color [] [] {{Color.white, Color.white, Color.white, Color.white, Color.white, Color.white, Color.white, Color.white, Color.white}, {Color.yellow, Color.yellow, Color.yellow, Color.yellow, Color.yellow, Color.yellow, Color.yellow, Color.yellow, Color.yellow}, {Color.blue, Color.blue, Color.blue, Color.blue, Color.blue, Color.blue, Color.blue, Color.blue, Color.blue}, {Color.green, Color.green, Color.green, Color.green, Color.green, Color.green, Color.green, Color.green, Color.green}, {Mains.betterOrange, Mains.betterOrange, Mains.betterOrange, Mains.betterOrange, Mains.betterOrange, Mains.betterOrange, Mains.betterOrange, Mains.betterOrange, Mains.betterOrange}, {Color.red, Color.red, Color.red, Color.red, Color.red, Color.red, Color.red, Color.red, Color.red}};
	}
public static void shuffle()
	{
	Random secondRandom = new Random();
	int numOfMv = secondRandom.nextInt(1000) + 100000;
	for (int x = 1; x <= numOfMv; x++)
		{
		Random firstRandom = new Random();
		int mvNum = firstRandom.nextInt(18) + 1;
		switch (mvNum)
			{
			case 1:
				{
				Moves.l();
				break;
				}
			case 2:
				{
				Moves.li();
				break;
				}
			case 3:
				{
				Moves.twol();
				break;
				}
			case 4:
				{
				Moves.r();
				break;
				}
			case 5:
				{
				Moves.ri();
				break;
				}
			case 6:
				{
				Moves.twor();
				break;
				}
			case 7:
				{
				Moves.u();
				break;
				}
			case 8:
				{
				Moves.ui();
				break;
				}
			case 9:
				{
				Moves.twou();
				break;
				}
			case 10:
				{
				Moves.d();
				break;
				}
			case 11:
				{
				Moves.di();
				break;
				}
			case 12:
				{
				Moves.twod();
				break;
				}
			case 13:
				{
				Moves.f();
				break;
				}
			case 14:
				{
				Moves.fi();
				break;
				}
			case 15:
				{
				Moves.twof();
				break;
				}
			case 16:
				{
				Moves.b();
				break;
				}
			case 17:
				{
				Moves.bi();
				break;
				}
			case 18:
				{
				Moves.twob();
				break;
				}
			}
		}
	}
}
