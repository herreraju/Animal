import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class befMains 
{
//static Color [][] check = new Color [][] {{Color.white, Color.white, Color.white, Color.white, Color.white, Color.white, Color.white, Color.white, Color.white}, {Color.yellow, Color.yellow, Color.yellow, Color.yellow, Color.yellow, Color.yellow, Color.yellow, Color.yellow, Color.yellow}, {Color.blue, Color.blue, Color.blue, Color.blue, Color.blue, Color.blue, Color.blue, Color.blue, Color.blue}, {Color.green, Color.green, Color.green, Color.green, Color.green, Color.green, Color.green, Color.green, Color.green}, {Mains.betterOrange, Mains.betterOrange, Mains.betterOrange, Mains.betterOrange, Mains.betterOrange, Mains.betterOrange, Mains.betterOrange, Mains.betterOrange, Mains.betterOrange}, {Color.red, Color.red, Color.red, Color.red, Color.red, Color.red, Color.red, Color.red, Color.red}};
static String usrmove = "usrmove";
public static void switchUsrmv()
	{
	switch (usrmove)
		{
		case "L":
			{
			Moves.l();
			RubGraph.cube();
			break;
			}
		case "L'":
			{
			Moves.li();
			RubGraph.cube();
			break;
			}
		case "L2":
			{
			Moves.twol();
			RubGraph.cube();
			break;
			}
		case "R":
			{
			Moves.r();
			RubGraph.cube();
			break;
			}
		case "R'":
			{
			Moves.ri();
			RubGraph.cube();
			break;
			}
		case "R2":
			{
			Moves.twor();
			RubGraph.cube();
			break;
			}
		case "U":
			{
			Moves.u();
			RubGraph.cube();
			break;
			}
		case "U'":
			{
			Moves.ui();
			RubGraph.cube();
			break;
			}
		case "U2":
			{
			Moves.twou();
			RubGraph.cube();
			break;
			}
		case "D":
			{
			Moves.d();
			RubGraph.cube();
			break;
			}
		case "D'":
			{
			Moves.di();
			RubGraph.cube();
			break;
			}
		case "D2":
			{
			Moves.twod();
			RubGraph.cube();
			break;
			}
		case "F":
			{
			Moves.f();
			RubGraph.cube();
			break;
			}
		case "F'":
			{
			Moves.fi();
			RubGraph.cube();
			break;
			}
		case "F2":
			{
			Moves.twof();
			RubGraph.cube();
			break;
			}
		case "B":
			{
			Moves.b();
			RubGraph.cube();
			break;
			}
		case "B'":
			{
			Moves.bi();
			RubGraph.cube();
			break;
			}
		case "B2":
			{
			Moves.twob();
			RubGraph.cube();
			break;
			}
		case "M":
			{
			Moves.m();
			RubGraph.cube();
			break;
			}
		case "M'":
			{
			Moves.mi();
			RubGraph.cube();
			break;
			}
		case "M2":
			{
			Moves.twom();
			RubGraph.cube();
			break;
			}
		case "E":
			{
			Moves.e();
			RubGraph.cube();
			break;
			}
		case "E'":
			{
			Moves.ei();
			RubGraph.cube();
			break;
			}
		case "E2":
			{
			Moves.twoe();
			RubGraph.cube();
			break;
			}
		case "S":
			{
			Moves.s();
			RubGraph.cube();
			break;
			}
		case "S'":
			{
			Moves.si();
			RubGraph.cube();
			break;
			}
		case "S2":
			{
			Moves.twos();
			RubGraph.cube();
			break;
			}
		case "TR":
		case "TURN RIGHT":
		case "turn right":
		case "Turn Right":
			{
			Turns.turnLeft();
			Turns.turnLeft();
			Turns.turnLeft();
			RubGraph.cube();
			break;
			}
		case "TL":
		case "TURN LEFT":
		case "turn left":
		case "Turn Left":
			{
			Turns.turnLeft();
			RubGraph.cube();
			break;
			}
		case "TD":
		case "TURN DOWN":
		case "turn down":
		case "Turn Down":
			{
	//		Turns.turnDown();
			RubGraph.cube();
			break;
			}
		case "TU":
		case "TURN UP":
		case "turn up":
		case "Turn Up":
			{
	//		Turns.turnDown();
	//		Turns.turnDown();
	//		Turns.turnDown();
			RubGraph.cube();
			break;
			}
		case "TC":
		case "TURN CLOCKWISE":
		case "turn clockwise":
		case "Turn Clockwise":
			{
			Turns.turnClockwise();
			RubGraph.cube();
			break;
			}
		case "TCC":
		case "TURN COUNTER-CLOCKWISE":
		case "turn counter-clockwise":
		case "Turn Counter-Clockwise":
			{
			Turns.turnClockwise();
			Turns.turnClockwise();
			Turns.turnClockwise();
			RubGraph.cube();
			break;
			}
		case "SHUFFLE":
		case "Shuffle":
		case "shuffle":
			{
			SpclMvs.shuffle();
			RubGraph.cube();
			break;
			}
		case "SOLVE":
		case "Solve":
		case "solve":
			{
			SpclMvs.solve();
			RubGraph.cube();
			break;
			}
		default:
			{
			}
		}
	}
public static void mainDo()
	{
	RubGraph.cube();
	RubGraph.button.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent arg0)
			{
			usrmove = RubGraph.txtfld.getText();
			switchUsrmv();
			RubGraph.txtfld.setText("");
//			if(Mains.sidesArray == check)
//				{
//				RubGraph.disEnd();
//				}
			}
		});
	}
}
