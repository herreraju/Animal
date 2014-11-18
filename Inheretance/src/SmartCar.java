
public class SmartCar extends Car
	{
	
	public void saveEnvironment()
		{
		numOfDoors = 2;
		System.out.println("You rest assured that the environment is safe as long as you drive this car, even if it is inconvenient that it only has " + numOfDoors + " doors.");
		}
	
	@Override
	public void drive()
		{
		makeNModel = "Smart Fortwo";
		System.out.println("The " + makeNModel + " cruises at a leisurely place.");
		}
	
	@Override
	public void driverFeel()
		{
		mpg = 34;
		System.out.println("You feel unworried about gas because this car gets " + mpg + " miles to the gallon.");
		}
	
	@Override
	public void reaction()
		{
		System.out.println("People respect you for respecting the earth.");
		}
	}