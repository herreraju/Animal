
public class Robin extends Bird implements Flyable
	{
	public Robin()
		{
		name = "robin";
		food = "worms";
		}

	@Override
	void makesNoise() 
		{
		System.out.println("The " + name + " says, \"Chirp.\"");
		}

	public void flies() 
		{
		System.out.println("The " + name + " can also fly!");
		}
	}
