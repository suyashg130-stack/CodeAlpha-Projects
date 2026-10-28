import java.util.*;
 class Stocks
{
	int sharesA = 0;
	int sharesB = 0;
	int sharesC = 0;
	int sharesD = 0;
	void out()
	{
		System.out.println("--------------stocks bar------------- ");
		System.out.println("A=1$");
		System.out.println("B=2$");
		System.out.println("C=3$");
		System.out.println("D=4$");
	}
	void buy()
	{
		System.out.println("enter the stock you want to buy :");
		int choice,share,price;
		Scanner s = new Scanner(System.in);
		System.out.println("press 1 for A");
		System.out.println("press 2 for B");
		System.out.println("press 3 for C");
		System.out.println("press 4 for D");
		choice =s.nextInt();
		switch (choice)
		{
		case 1:
			System.out.println("A=1$");
			System.out.println("eneter the no. of shares you want to buy:");
			 share=s.nextInt();
			 price=share*1;
			 System.out.println("price :" + price);
			 sharesA = sharesA + share;
			 break;
		case 2:

			System.out.println("B=2$");
			System.out.println("eneter the no. of shares you want to buy:");
			 share=s.nextInt();
			 price=share*2;
			 System.out.println("price :" + price);
			 sharesB = sharesB + share;
			 break;
		case 3:
			System.out.println("C=3$");
			System.out.println("eneter the no. of shares you want to buy:");
			 share=s.nextInt();
			 price=share*3;
			 System.out.println("price :" + price);
			 sharesC = sharesC + share;
			 break;
		case 4:
			System.out.println("D=4$");
			System.out.println("eneter the no. of shares you want to buy:");
			 share=s.nextInt();
			 price=share*4;
			 System.out.println("price :" + price);
			 sharesD = sharesD + share;
			 break;
		default:
			System.out.println("please enter a valid option");
			
		}
	}
	int portfolio()
	{
		    System.out.println("----- Your Portfolio -----");
		    System.out.println("A shares: " + sharesA);
		    System.out.println("B shares: " + sharesB);
		    System.out.println("C shares: " + sharesC);
		    System.out.println("D shares: " + sharesD);
		return 0;
	}
	void sell()
	{
		System.out.println("enter the share you wnat to sell:");
		int choice,share,price;
		Scanner s = new Scanner(System.in);
		System.out.println("press 1 for A");
		System.out.println("press 2 for B");
		System.out.println("press 3 for C");
		System.out.println("press 4 for D");
		choice =s.nextInt();
		System.out.println("enter the quantity of shares:");
		int q=s.nextInt();
		switch (choice)
		{
		case 1:
			if(q<=sharesA && q>0)
			{
				sharesA=sharesA - q;
				System.out.println(q+" shares sold " + " amount in wallet " + q*1);
			}
			else 
			{
				System.out.println("you dont own that much of shares:");
			}
			break;
		case 2:
			if(q<=sharesB && q>0)
			{
				sharesB=sharesB - q;
				System.out.println(q+" shares sold " + " amount in wallet " + q*2);
			}
			else 
			{
				System.out.println("you dont own that much of shares:");
			}
			break;
		case 3:
			if(q<=sharesC && q>0)
			{
				sharesC=sharesC - q;
				System.out.println(q+" shares sold " + " amount in wallet " + q*3);
				break;
			}
			else 
			{
				System.out.println("you dont own that much of shares:");
			}
			break;
		case 4:
			if(q<=sharesD && q>0)
			{
				sharesD=sharesD - q;
				System.out.println(q+" shares sold " + " amount in wallet " + q*4+"$");
			}
			else 
			{
				System.out.println("you dont own that much of shares:");
			}
			break;
		default:
			System.out.println("enter a valid choice");
		}
	}
	public static void main(String args[])
	{
		System.out.println("____welcome___");
		System.out.println("here are the stocks you might be intrested in:");
		Stocks s = new Stocks();
		s.out();
		Scanner sc = new Scanner(System.in);
		System.out.println("press 1 to enter the market else 0 to discontinue");
		int flag =sc.nextInt();
		if(flag==1)
		{
			s.buy();
			s.portfolio();
		}
		System.out.println("enter 1 to buy again");
		System.out.println("enter 2 to sell ");
		System.out.println("enter 3 to view portfolio");
		System.out.println("4 for exit");
		int choice = sc.nextInt();
		do
		{
			switch(choice)
			{
			case 1:
				s.buy();
				s.portfolio();
				break;
			case 2:
				s.sell();
				s.portfolio();
				break;
			case 3:
				s.portfolio();
				break;
			case 4:
				System.out.println("exit");
				break;
			default:
				System.out.println("Select a valid option");
				
			}
		}while(choice!=4);
		
		
		
	}
	
}
