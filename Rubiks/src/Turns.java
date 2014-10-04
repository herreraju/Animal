import java.awt.Color;


public class Turns 
{
	static int c;
	static int i;
	public static void turnLeft()
	{
	Color[] colArrTemp;
	colArrTemp = Mains.sidesArray [0];
	Mains.sidesArray [0] = Mains.sidesArray [5];
	c = 8;
	for(i = 0; i <= 8; i++)
		{
		Mains.sidesArray[5][i] = Mains.sidesArray[1][c];
		c--;
		}
	c = 8;
	for(i = 0; i <= 8; i++)
		{
		Mains.sidesArray[1][i] = Mains.sidesArray[4][c];
		c--;
		}
	Mains.sidesArray [4] = colArrTemp;
	
	Moves.tempvar1 = Mains.sidesArray [2][0];
	Moves.tempvar2 = Mains.sidesArray [2][1];
	Moves.tempvar3 = Mains.sidesArray [2][2];
	Mains.sidesArray [2][1] = Mains.sidesArray [2][3];
	Mains.sidesArray [2][0] = Mains.sidesArray [2][6];
	Mains.sidesArray [2][3] = Mains.sidesArray [2][7];
	Mains.sidesArray [2][6] = Mains.sidesArray [2][8];
	Mains.sidesArray [2][7] = Mains.sidesArray [2][5];
	Mains.sidesArray [2][8] = Moves.tempvar3;
	Mains.sidesArray [2][5] = Moves.tempvar2;
	Mains.sidesArray [2][2] = Moves.tempvar1;
	
	Moves.tempvar1 = Mains.sidesArray [3][0];
	Moves.tempvar2 = Mains.sidesArray [3][1];
	Moves.tempvar3 = Mains.sidesArray [3][2];
	Mains.sidesArray [3][1] = Mains.sidesArray [3][5];
	Mains.sidesArray [3][2] = Mains.sidesArray [3][8];
	Mains.sidesArray [3][5] = Mains.sidesArray [3][7];
	Mains.sidesArray [3][8] = Mains.sidesArray [3][6];
	Mains.sidesArray [3][7] = Mains.sidesArray [3][3];
	Mains.sidesArray [3][6] = Moves.tempvar1;
	Mains.sidesArray [3][3] = Moves.tempvar2;
	Mains.sidesArray [3][0] = Moves.tempvar3;
	}
public static void turnRight()
	{
	Color[] colArrTemp;
	colArrTemp = Mains.sidesArray [0];
	Mains.sidesArray [0] = Mains.sidesArray [4];
	c = 8;
	for(i = 0; i <= 8; i++)
		{
		Mains.sidesArray[4][i] = Mains.sidesArray[1][c];
		c--;
		}
	c = 8;
	for(i = 0; i <= 8; i++)
		{
		Mains.sidesArray[1][i] = Mains.sidesArray[5][c];
		c--;
		}
	Mains.sidesArray [5] = colArrTemp;
	
	Moves.tempvar1 = Mains.sidesArray [3][0];
	Moves.tempvar2 = Mains.sidesArray [3][1];
	Moves.tempvar3 = Mains.sidesArray [3][2];
	Mains.sidesArray [3][1] = Mains.sidesArray [3][3];
	Mains.sidesArray [3][0] = Mains.sidesArray [3][6];
	Mains.sidesArray [3][3] = Mains.sidesArray [3][7];
	Mains.sidesArray [3][6] = Mains.sidesArray [3][8];
	Mains.sidesArray [3][7] = Mains.sidesArray [3][5];
	Mains.sidesArray [3][8] = Moves.tempvar3;
	Mains.sidesArray [3][5] = Moves.tempvar2;
	Mains.sidesArray [3][2] = Moves.tempvar1;
	
	Moves.tempvar1 = Mains.sidesArray [3][0];
	Moves.tempvar2 = Mains.sidesArray [3][1];
	Moves.tempvar3 = Mains.sidesArray [3][2];
	Mains.sidesArray [3][1] = Mains.sidesArray [3][5];
	Mains.sidesArray [3][2] = Mains.sidesArray [3][8];
	Mains.sidesArray [3][5] = Mains.sidesArray [3][7];
	Mains.sidesArray [3][8] = Mains.sidesArray [3][6];
	Mains.sidesArray [3][7] = Mains.sidesArray [3][3];
	Mains.sidesArray [3][6] = Moves.tempvar1;
	Mains.sidesArray [3][3] = Moves.tempvar2;
	Mains.sidesArray [3][0] = Moves.tempvar3;
	}
public static void turnClockwise()
	{
	Color[] colArrTemp;
	colArrTemp = Mains.sidesArray [2];
	Mains.sidesArray [2] = Mains.sidesArray [4];
	Mains.sidesArray [4] = Mains.sidesArray [3];
	Mains.sidesArray [3] = Mains.sidesArray [5];
	Mains.sidesArray [5] = colArrTemp;
	Moves.tempvar1 = Mains.sidesArray [0][0];
	Moves.tempvar2 = Mains.sidesArray [0][1];
	Moves.tempvar3 = Mains.sidesArray [0][2];
	Mains.sidesArray [0][0] = Mains.sidesArray [0][6];
	Mains.sidesArray [0][1] = Mains.sidesArray [0][3];
	Mains.sidesArray [0][3] = Mains.sidesArray [0][7];
	Mains.sidesArray [0][6] = Mains.sidesArray [0][8];
	Mains.sidesArray [0][7] = Mains.sidesArray [0][5];
	Mains.sidesArray [0][8] = Moves.tempvar3;
	Mains.sidesArray [0][5] = Moves.tempvar2;
	Mains.sidesArray [0][2] = Moves.tempvar1;
	Moves.tempvar1 = Mains.sidesArray [1][0];
	Moves.tempvar2 = Mains.sidesArray [1][1];
	Moves.tempvar3 = Mains.sidesArray [1][2];
	Mains.sidesArray [1][1] = Mains.sidesArray [1][5];
	Mains.sidesArray [1][2] = Mains.sidesArray [1][8];
	Mains.sidesArray [1][5] = Mains.sidesArray [1][7];
	Mains.sidesArray [1][8] = Mains.sidesArray [1][6];
	Mains.sidesArray [1][7] = Mains.sidesArray [1][3];
	Mains.sidesArray [1][0] = Moves.tempvar3;
	Mains.sidesArray [1][3] = Moves.tempvar2;
	Mains.sidesArray [1][6] = Moves.tempvar1;
	}
}
