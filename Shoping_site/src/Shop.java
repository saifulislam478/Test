import java.util.Scanner;

public class Shop {
	
	int itemsId;
	String itemname;
	String ShopName;
	String shopId;
	static String Country="India";
	
	public void ItemPrice(int itemId)
	{
		System.out.print("Inside the Item Price methos item price="+itemId);
	}
	
	public int getShopKeeperId(ShopKeeper sk)
	{
		return sk.shopKeeperId;
	}
	public ShopKeeper getShopDetails()
	{
		ShopKeeper sk=new ShopKeeper(108,"Anowar");
		
		
		return sk;
	}
	

	public static void main(String[]args)
	
	{
		//Sort_Design d= new Sort_Design();
	System.out.println("Enter the number that you want to reverse");
		
		//Scanner input = new Scanner(System.in);
		//int number = input.nextInt();
		//int y=d.ReverseInt(number);
		//System.out.println("Reverse number of "+number +" is "+y);
		
		Shop s=new Shop();
		ShopKeeper sk=new ShopKeeper(100,"Saiful Islam");
		
		System.out.println(sk.shopKeeperName+" is the owner of shopId with Id "+sk.shopKeeperId);
		
		System.out.println("Shop Name= "+s.getShopDetails().shopKeeperName);
		System.out.println("Shop Id= "+s.getShopKeeperId(new ShopKeeper(201,"Rejaul")));
		
		
		
		  //d.Perpendicular_Triangle();
		  //System.out.println("..........................");
		  //d.Perpendicular_Triangle1();
		  //System.out.println("..........................");
		  //d.Perpendicular_Triangle2();
		  //System.out.println("..........................");
		  //d.Perpendicular_Triangle3();
		  //System.out.println("..........................");
		  //d.Perpendicular_Triangle4();
		  //System.out.println("..........................");
		 		
		
	}
}
