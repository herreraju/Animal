
public class VehiRunner 
	{
	public static void main(String[] args) 
		{
		Vehicle vehicle = new Vehicle();
		Car car = new Car();
		Motorcycle motorcycle = new Motorcycle();
		SmartCar smartCar = new SmartCar();
		Beetle beetle = new Beetle();
		Ninja ninja = new Ninja();
		HarleyDavidson harleyDavidson = new HarleyDavidson();
		System.out.println("Vehicle:");
		vehicle.reaction();
		vehicle.drive();
		vehicle.driverFeel();
		System.out.println();
		System.out.println();
		System.out.println("Car:");
		car.reaction();
		car.drive();
		car.driverFeel();
		car.heat();
		System.out.println();
		System.out.println();
		System.out.println("Motorcycle:");
		motorcycle.reaction();
		motorcycle.drive();
		motorcycle.driverFeel();
		motorcycle.windInHair();
		System.out.println();
		System.out.println();
		System.out.println("SmartCar:");
		smartCar.reaction();
		smartCar.drive();
		smartCar.driverFeel();
		smartCar.heat();
		smartCar.saveEnvironment();
		System.out.println();
		System.out.println();
		System.out.println("Beetle:");
		beetle.reaction();
		beetle.drive();
		beetle.driverFeel();
		beetle.heat();
		beetle.fillTrunk();
		System.out.println();
		System.out.println();
		System.out.println("Ninja:");
		ninja.reaction();
		ninja.drive();
		ninja.driverFeel();
		ninja.windInHair();
		ninja.winRace();
		System.out.println();
		System.out.println();
		System.out.println("Harley Davidson:");
		harleyDavidson.reaction();
		harleyDavidson.drive();
		harleyDavidson.driverFeel();
		harleyDavidson.windInHair();
		harleyDavidson.burstEardrums();
		}
	}
