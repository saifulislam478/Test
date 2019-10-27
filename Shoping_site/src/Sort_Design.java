
public class Sort_Design {
	
	public int ReverseInt(int x)
	{
		int reminder,rev=0;
		while(x>0)
		{
			reminder=x%10;
			rev=rev*10+reminder;
			x=x/10;
		
		}
		return rev;
		
	}
	
	public void Perpendicular_Triangle()
	{
		for(int i=0;i<5;i++)
		{
			for(int j=i;j<5;j++)
			{
				System.out.print("*");
			
			}
			System.out.println();
		}
	}
	
	public void Perpendicular_Triangle1()
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<i;j++)
			{
				
				System.out.print("*");
				
			}
			for(int j=i;j<5;j++)
			{
				
				System.out.print(" ");
				
			
			}
			System.out.println();
		}
	}
		public void Perpendicular_Triangle2()
		{
			for(int i=0;i<5;i++)
			{
				for(int j=0;j<i;j++)
				{
					
					System.out.print(" ");
					
				}
				for(int j=i;j<5;j++)
				{
					
					System.out.print("*");
					
				
				}
				System.out.println();
			}
	}
		public void Perpendicular_Triangle3()
		{
			for(int i=0;i<5;i++)
			{
				for(int j=5;j>i;j--)
				{
					
					System.out.print(" ");
					
				}
				for(int j=0;j<=i;j++)
				{
					
					System.out.print("* ");
					
				
				}
				System.out.println();
			}
	}
		public void Perpendicular_Triangle4()
		{
			for(int i=0;i<5;i++)
			{
				for(int j=0;j<=i;j++)
				{
					
					System.out.print(" ");
					
				}
				for(int j=5;j>i;j--)
				{
					
					System.out.print("* ");
					
				
				}
				System.out.println();
			}
	}

}
