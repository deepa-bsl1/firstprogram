
import java.util.Scanner;
public class primeNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int i;
		boolean flag=false;
		Scanner input= new Scanner(System.in);
		System.out.print("Enter any number");
		
		 num=input.nextInt();
		 
		 for(i=2;i<num/2;i++)
		 {
			 if(num % i== 0)
			 {
			//	 System.out.print("The number is not prime");
				flag= true;
				 break;
				 
			 }
		 }
		 if(flag)
					 System.out.println("Number is not prime");

		 else 
			 
			 System.out.println("Number is not prime");
		 }
		
		

	

}
