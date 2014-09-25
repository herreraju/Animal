import java.util.ArrayList;
import java.util.Scanner;
 
public class FromList
	{
	static boolean card;
	static double ddit;
	static double discon = 0;
	static double totcon = 0;
	
	public static void doHaveKSCard()
		{
		System.out.println("Do you have a King Soopers card?");
		Scanner keyboard = new Scanner(System.in);
		String yOrN = keyboard.next();
		switch(yOrN)
			{
			case "YES":
			case "yes":
			case "Yes":
			case "yES":
				{
				card = true;
				break;
				}
			case "NO":
			case "no":
			case "No":
			case "nO":
				{
				card = false;
				break;
				}
			default:
				{
				System.out.println("INVALID");
				System.out.println("DEFAULT FALSE");
				card = false;
				}
			}
		}
	public static void getDiscount()
		{
		if(card == true)
			{
			for(Item x: FileImport.groceryList)
			 	{
				ddit = x.getCost();
				x.setCost((ddit - x.getDiscount()));
				discon += x.getDiscount();
			 	}
			}
		for(Item x: FileImport.groceryList)
		 	{
			ddit = x.getCost();
			x.setCost((ddit * x.getHowMany()));
		 	}
		}
	public static void printItems()
		{
		for(Item x: FileImport.groceryList)
		 	{
			System.out.print(x.getHowMany() + " " + x.getItemName() + " $");
			System.out.printf("%.2f", x.getCost());
			System.out.print("\n");
			totcon += x.getCost();
		 	}
		System.out.print("Your total is: ");
		System.out.printf("%.2f", totcon);
		System.out.print("\n");
		
		if(card == true)
			{
			System.out.print("You saved: ");
			System.out.printf("%.2f", discon);
			System.out.print("\n");
			}
		}
	public static void main(String[] args) 
		{
		FileImport.importFile();
		FileImport.addItems();
		doHaveKSCard();
		getDiscount();
		printItems();
		}
	}