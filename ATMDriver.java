import java.util.*;
class ATMDriver 
{
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) 
	{
		Bank c1 = new Bank("Gautam Rana", 1234, 5000, 2023);
		ATMSBI a = new ATMSBIChild();
		boolean b = true;
		while (b)
		{
			System.out.println("Enter 1 for withdraw \nEnter 2 for deposite \nEnter 3 to check AccountBalance \nEnter 4 to change a the pin \nEnter 5 to get details");
			int option = scan.nextInt();

			switch (option)
			{
			case 1:
				a.withdraw(c1);
			    break;
			case 2:
				a.deposite(c1);
			    break;
			case 3:
				a.checkBalance(c1);
			    break;
			case 4:
				a.changePin(c1);
			    break;
			case 5:
				a.details(c1);
			    break;
			default:
				System.out.println("Invalid Choice");
				System.out.println("Choose correct option");
			}
			System.out.println("Do you want to continue the operation then press 1 \nPress any other key for Exit.");

			int v = scan.nextInt();
			if (v != 1)
			{
				b = false;
			}
		}
	}
}
