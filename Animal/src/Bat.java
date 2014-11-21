
public class Bat extends Mammal implements Flyable
	{
	public Bat()
		{
		name = "bat";
		food = "insects";
		}

	@Override
	void makesNoise() 
		{
		System.out.println("The " + name + " emits an ultrasonic pulse.");
		}

	public void flies() 
		{
		System.out.println("The " + name + " can also fly!");
		}

	}
