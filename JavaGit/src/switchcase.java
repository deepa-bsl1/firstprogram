
public class switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=50;
				int b=25;
				int c;
				
				if(a>b)
				{
				 switch(b+5)
				 {
				 case 5:
				 {
					 c=a+b;
					//System.out.println("The assignment operator = "+c);
					 System.out.println("The addition of a and b = " +c);
					  break;
				 }
					 
					 case 20:
					 {
						 c=a-b;
						 System.out.println("The subtraction of a and b= "+c);
				break;
					 }
					 case 30:
					 {
					 c=a*b;
					 System.out.println("The multiplication of a and b= "+c);
					 }
					 case 40:
					 {
					c=a/b;
					System.out.println("The Division of a and b = "+c);
					break;
					 }
					 default:
						System.out.println() 
				 }
				 }
				 
				 
				}
				
				
	}


