import java.util.ArrayList;
import java.util.Scanner;

public class Item
	{
	private String itemName;
	private double cost;
	private double discount;
	private int howMany;
	public Item(int hm, String itnm, double cst, double uncst)
		{
		itemName = itnm;
		cost = cst;
		howMany = hm;
		discount = uncst;
		}
	public double getDiscount()
		{
		return discount;
		}
	public void setDiscount(double discount)
		{
		this.discount = discount;
		}
	public String getItemName()
		{
		return itemName;
		}

	public void setItemName(String itemName)
		{
		this.itemName = itemName;
		}

	public double getCost()
		{
		return cost;
		}

	public void setCost(double cost)
		{
		this.cost = cost;
		}

	public int getHowMany()
		{
		return howMany;
		}

	public void setHowMany(int howMany)
		{
		this.howMany = howMany;
		}
	
	}