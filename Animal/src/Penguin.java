
public class Penguin extends Bird
	{
	public Penguin()
		{
		name = "penguin";
		food = "fish";
		}

	@Override
	void makesNoise() 
		{
		System.out.println("The " + name + " says, \"Brrr....\"");
		}

	public void flies() 
		{
		}
	}
