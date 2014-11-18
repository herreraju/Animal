
public class HarleyDavidson extends Motorcycle
	{
	public void burstEardrums()
		{
		System.out.println("RM-M-M-M-M-M-M-M-M-M!!!!!!!!!!!!!!!");
		}
	
	@Override
	public void drive()
		{
		makeNModel = "Harley Davidson Road Glide";
		System.out.println("The " + makeNModel + " hums down the street.");
		}
	
	@Override
	public void driverFeel()
		{
		hasRadio = true;
		if (hasRadio == true) 
			{
			System.out.println("You listen to your favorite song muffled by the hum of your bike.");
			}
		else 
			{
			System.out.println("You hear the hum of your bike. It is music to your ears.");
			}
		}
	
	@Override
	public void reaction()
		{
		System.out.println("Your wife hires a psycologist to help you through your mid-life crisis.");
		}
	}