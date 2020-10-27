import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("This program is to Print the greatest of 3 numbers");
		
		Scanner scanner1= new Scanner(System.in);
		System.out.println("Enter number 1 ");
		
		int num1=scanner1.nextInt();
		
		Scanner scanner2= new Scanner(System.in);
		System.out.println("Enter number 2 ");
		
		int num2=scanner2.nextInt();
		
		Scanner scanner3= new Scanner(System.in);
		System.out.println("Enter number 3 ");
		
		int num3=scanner2.nextInt();
		
		if( num1> num2 && num1>num3)
				{
			
			System.out.println("Number 1 is the greatest and value is = " +num1);
				}
			else if (num2>num3 && num2>num1)
				
			{
				System.out.println("Number 2 is the greatest and value is = " +num2);
		}
		
			else
				System.out.println("Number 3 is the greatest and value is = " +num3
						);
	}

}
