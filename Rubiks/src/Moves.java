import java.awt.Color;


public class Moves 
{
	static Color tempvar1;
	static Color tempvar2;
	static Color tempvar3;
	public static void l()
	{
	tempvar1 = Mains.sidesArray[0][0];
	tempvar2 = Mains.sidesArray[0][3];
	tempvar3 = Mains.sidesArray[0][6];
	Mains.sidesArray[0][0] = Mains.sidesArray[2][0];
	Mains.sidesArray[0][3] = Mains.sidesArray[2][3];
	Mains.sidesArray[0][6] = Mains.sidesArray[2][6];
	Mains.sidesArray[2][0] = Mains.sidesArray[1][0];
	Mains.sidesArray[2][3] = Mains.sidesArray[1][3];
	Mains.sidesArray[2][6] = Mains.sidesArray[1][6];
	Mains.sidesArray[1][0] = Mains.sidesArray[3][0];
	Mains.sidesArray[1][3] = Mains.sidesArray[3][3];
	Mains.sidesArray[1][6] = Mains.sidesArray[3][6];
	Mains.sidesArray[3][0] = tempvar1;
	Mains.sidesArray[3][3] = tempvar2;
	Mains.sidesArray[3][6] = tempvar3;
	tempvar1 = Mains.sidesArray[4][0];
	tempvar2 = Mains.sidesArray[4][1];
	tempvar3 = Mains.sidesArray[4][2];
	Mains.sidesArray[4][0] = Mains.sidesArray[4][6];
	Mains.sidesArray[4][1] = Mains.sidesArray[4][3];
	Mains.sidesArray[4][3] = Mains.sidesArray[4][7];
	Mains.sidesArray[4][6] = Mains.sidesArray[4][8];
	Mains.sidesArray[4][7] = Mains.sidesArray[4][5];
	Mains.sidesArray[4][8] = tempvar3;
	Mains.sidesArray[4][5] = tempvar2;
	Mains.sidesArray[4][2] = tempvar1;
	}
public static void twol()
	{
	li();
	li();
	}
public static void li()
	{
	l();
	l();
	l();
	}
public static void r()
	{
	tempvar1 = Mains.sidesArray[2][2];
	tempvar2 = Mains.sidesArray[2][5];
	tempvar3 = Mains.sidesArray[2][8];
	Mains.sidesArray[2][2] = Mains.sidesArray[0][2];
	Mains.sidesArray[2][5] = Mains.sidesArray[0][5];
	Mains.sidesArray[2][8] = Mains.sidesArray[0][8];
	Mains.sidesArray[0][2] = Mains.sidesArray[3][2];
	Mains.sidesArray[0][5] = Mains.sidesArray[3][5];
	Mains.sidesArray[0][8] = Mains.sidesArray[3][8];
	Mains.sidesArray[3][2] = Mains.sidesArray[1][2];
	Mains.sidesArray[3][5] = Mains.sidesArray[1][5];
	Mains.sidesArray[3][8] = Mains.sidesArray[1][8];
	Mains.sidesArray[1][2] = tempvar1;
	Mains.sidesArray[1][5] = tempvar2;
	Mains.sidesArray[1][8] = tempvar3;
	tempvar1 = Mains.sidesArray[5][0];
	tempvar2 = Mains.sidesArray[5][1];
	tempvar3 = Mains.sidesArray[5][2];
	Mains.sidesArray[5][0] = Mains.sidesArray[5][6];
	Mains.sidesArray[5][1] = Mains.sidesArray[5][3];
	Mains.sidesArray[5][3] = Mains.sidesArray[5][7];
	Mains.sidesArray[5][6] = Mains.sidesArray[5][8];
	Mains.sidesArray[5][7] = Mains.sidesArray[5][5];
	Mains.sidesArray[5][8] = tempvar3;
	Mains.sidesArray[5][5] = tempvar2;
	Mains.sidesArray[5][2] = tempvar1;
	}
public static void twor()
	{
	ri();
	ri();
	}
public static void ri()
	{
	r();
	r();
	r();
	}
public static void u()
	{
	tempvar1 = Mains.sidesArray[5][0];
	tempvar2 = Mains.sidesArray[5][1];
	tempvar3 = Mains.sidesArray[5][2];
	Mains.sidesArray[5][0] = Mains.sidesArray[1][8];
	Mains.sidesArray[5][1] = Mains.sidesArray[1][7];
	Mains.sidesArray[5][2] = Mains.sidesArray[1][6];
	Mains.sidesArray[1][8] = Mains.sidesArray[4][0];
	Mains.sidesArray[1][7] = Mains.sidesArray[4][1];
	Mains.sidesArray[1][6] = Mains.sidesArray[4][2];
	Mains.sidesArray[4][0] = Mains.sidesArray[0][0];
	Mains.sidesArray[4][1] = Mains.sidesArray[0][1];
	Mains.sidesArray[4][2] = Mains.sidesArray[0][2];
	Mains.sidesArray[0][0] = tempvar1;
	Mains.sidesArray[0][1] = tempvar2;
	Mains.sidesArray[0][2] = tempvar3;
	tempvar1 = Mains.sidesArray[2][0];
	tempvar2 = Mains.sidesArray[2][1];
	tempvar3 = Mains.sidesArray[2][2];
	Mains.sidesArray[2][0] = Mains.sidesArray[2][6];
	Mains.sidesArray[2][1] = Mains.sidesArray[2][3];
	Mains.sidesArray[2][3] = Mains.sidesArray[2][7];
	Mains.sidesArray[2][6] = Mains.sidesArray[2][8];
	Mains.sidesArray[2][7] = Mains.sidesArray[2][5];
	Mains.sidesArray[2][8] = tempvar3;
	Mains.sidesArray[2][5] = tempvar2;
	Mains.sidesArray[2][2] = tempvar1;
	}
public static void twou()
	{
	u();
	u();
	}
public static void ui()
	{
	u();
	u();
	u();
	}
public static void d()
	{
	tempvar1 = Mains.sidesArray[0][6];
	tempvar2 = Mains.sidesArray[0][7];
	tempvar3 = Mains.sidesArray[0][8];
	Mains.sidesArray[0][6] = Mains.sidesArray[4][6];
	Mains.sidesArray[0][7] = Mains.sidesArray[4][7];
	Mains.sidesArray[0][8] = Mains.sidesArray[4][8];
	Mains.sidesArray[4][6] = Mains.sidesArray[1][2];
	Mains.sidesArray[4][7] = Mains.sidesArray[1][1];
	Mains.sidesArray[4][8] = Mains.sidesArray[1][0];
	Mains.sidesArray[1][2] = Mains.sidesArray[5][6];
	Mains.sidesArray[1][1] = Mains.sidesArray[5][7];
	Mains.sidesArray[1][0] = Mains.sidesArray[5][8];
	Mains.sidesArray[5][6] = tempvar1;
	Mains.sidesArray[5][7] = tempvar2;
	Mains.sidesArray[5][8] = tempvar3;
	tempvar1 = Mains.sidesArray[3][0];
	tempvar2 = Mains.sidesArray[3][1];
	tempvar3 = Mains.sidesArray[3][2];
	Mains.sidesArray[3][0] = Mains.sidesArray[3][6];
	Mains.sidesArray[3][1] = Mains.sidesArray[3][3];
	Mains.sidesArray[3][3] = Mains.sidesArray[3][7];
	Mains.sidesArray[3][6] = Mains.sidesArray[3][8];
	Mains.sidesArray[3][7] = Mains.sidesArray[3][5];
	Mains.sidesArray[3][8] = tempvar3;
	Mains.sidesArray[3][5] = tempvar2;
	Mains.sidesArray[3][2] = tempvar1;
	}
public static void twod()
	{
	d();
	d();
	}
public static void di()
	{
	d();
	d();
	d();
	}
public static void f()
	{
	tempvar1 = Mains.sidesArray[2][6];
	tempvar2 = Mains.sidesArray[2][7];
	tempvar3 = Mains.sidesArray[2][8];
	Mains.sidesArray[2][6] = Mains.sidesArray[4][8];
	Mains.sidesArray[2][7] = Mains.sidesArray[4][5];
	Mains.sidesArray[2][8] = Mains.sidesArray[4][2];
	Mains.sidesArray[4][8] = Mains.sidesArray[3][2];
	Mains.sidesArray[4][5] = Mains.sidesArray[3][1];
	Mains.sidesArray[4][2] = Mains.sidesArray[3][0];
	Mains.sidesArray[3][2] = Mains.sidesArray[5][0];
	Mains.sidesArray[3][1] = Mains.sidesArray[5][3];
	Mains.sidesArray[3][0] = Mains.sidesArray[5][6];
	Mains.sidesArray[5][0] = tempvar1;
	Mains.sidesArray[5][3] = tempvar2;
	Mains.sidesArray[5][6] = tempvar3;
	tempvar1 = Mains.sidesArray[0][0];
	tempvar2 = Mains.sidesArray[0][1];
	tempvar3 = Mains.sidesArray[0][2];
	Mains.sidesArray[0][0] = Mains.sidesArray[0][6];
	Mains.sidesArray[0][1] = Mains.sidesArray[0][3];
	Mains.sidesArray[0][3] = Mains.sidesArray[0][7];
	Mains.sidesArray[0][6] = Mains.sidesArray[0][8];
	Mains.sidesArray[0][7] = Mains.sidesArray[0][5];
	Mains.sidesArray[0][8] = tempvar3;
	Mains.sidesArray[0][5] = tempvar2;
	Mains.sidesArray[0][2] = tempvar1;
	}
public static void twof()
	{
	f();
	f();
	}
public static void fi()
	{
	f();
	f();
	f();
	}
public static void b()
	{
	tempvar1 = Mains.sidesArray[3][6];
	tempvar2 = Mains.sidesArray[3][7];
	tempvar3 = Mains.sidesArray[3][8];
	Mains.sidesArray[3][8] = Mains.sidesArray[4][6];
	Mains.sidesArray[3][7] = Mains.sidesArray[4][3];
	Mains.sidesArray[3][6] = Mains.sidesArray[4][0];
	Mains.sidesArray[4][6] = Mains.sidesArray[2][0];
	Mains.sidesArray[4][3] = Mains.sidesArray[2][1];
	Mains.sidesArray[4][0] = Mains.sidesArray[2][2];
	Mains.sidesArray[2][0] = Mains.sidesArray[5][2];
	Mains.sidesArray[2][1] = Mains.sidesArray[5][5];
	Mains.sidesArray[2][2] = Mains.sidesArray[5][8];
	Mains.sidesArray[5][8] = tempvar1;
	Mains.sidesArray[5][5] = tempvar2;
	Mains.sidesArray[5][2] = tempvar3;
	tempvar1 = Mains.sidesArray[1][0];
	tempvar2 = Mains.sidesArray[1][1];
	tempvar3 = Mains.sidesArray[1][2];
	Mains.sidesArray[1][0] = Mains.sidesArray[1][6];
	Mains.sidesArray[1][1] = Mains.sidesArray[1][3];
	Mains.sidesArray[1][3] = Mains.sidesArray[1][7];
	Mains.sidesArray[1][6] = Mains.sidesArray[1][8];
	Mains.sidesArray[1][7] = Mains.sidesArray[1][5];
	Mains.sidesArray[1][8] = tempvar3;
	Mains.sidesArray[1][5] = tempvar2;
	Mains.sidesArray[1][2] = tempvar1;
	}
public static void twob()
	{
	b();
	b();
	}
public static void bi()
	{
	b();
	b();
	b();
	}
public static void m()
	{
	li();
	r();
	}
public static void mi()
	{
	m();
	m();
	m();
	}
public static void twom()
	{
	m();
	m();
	}
public static void e()
	{
	di();
	u();
	}
public static void ei()
	{
	e();
	e();
	e();
	}
public static void twoe()
	{
	e();
	e();
	}
public static void s()
	{
	fi();
	b();
	}
public static void si()
	{
	s();
	s();
	s();
	}
public static void twos()
	{
	s();
	s();
	}

}
