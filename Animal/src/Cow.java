
public class Cow extends Mammal
	{
	public Cow()
		{
		name = "cow";
		food = "grass";
		}

	@Override
	void makesNoise() 
		{
		System.out.println("The " + name + " says, \"Moo.\"");
		}

	public void flies() 
		{
		}
	}
