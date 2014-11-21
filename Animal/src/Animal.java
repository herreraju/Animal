
public abstract class Animal 
	{
	String name;
	String food;
	abstract void bearsYoung();
	public void eats()
		{
		System.out.println("The " + name + " is looking forward to eating some " + food + ".");
		}
	abstract void makesNoise();
	abstract void flies();
	}
