
public class Beetle extends Car
	{
	
	public void fillTrunk()
		{
		numOfDoors = 4;
		System.out.println("You stuff the trunk and all " + numOfDoors + " doors with your junk.");
		}
	
	@Override
	public void drive()
		{
		makeNModel = "Volkswagen Beetle";
		System.out.println("The " + makeNModel + " cruises groovily.");
		}
	
	@Override
	public void driverFeel()
		{
		mpg = 25;
		System.out.println("You are not very worried about gas because this car gets " + mpg + " miles to the gallon.");
		}
	
	@Override
	public void reaction()
		{
		System.out.println("\"Slugbug\" *Punch*");
		}
	}