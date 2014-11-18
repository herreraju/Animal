public class Ninja extends Motorcycle
	{
	
	public void winRace()
		{
		System.out.println("You zip by the competition, crossing the finish line and claiming victory.");
		}
	
	@Override
	public void drive()
		{
		makeNModel = "Kawasaki Ninja";
		System.out.println("The " + makeNModel + " speeds down the street.");
		}
	
	@Override
	public void driverFeel()
		{
		hasRadio = false;
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
		System.out.println("Your fans cheer you on.");
		}
	}