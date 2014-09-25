import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class FileImport
{
static Scanner file;
static int c;
static int w;
static String s;
static double d;
static double dd;
static ArrayList<Item> groceryList = new ArrayList<Item>();
	public static void importFile() 
	{
	try
		{
		file = new Scanner(new File( "GroceryList.txt"));
		}
	catch (FileNotFoundException e)
		{
		e.printStackTrace();
		}
	}
	public static void addItems()
	{
	c = file.nextInt();
	  for(int i = 0; i < c; i++)
	    {
	    w = file.nextInt();
	    s = file.next();
	    d = file.nextDouble();
	    dd = file.nextDouble();
	    groceryList.add(new Item(w, s, d, dd));
	    }
	}
}