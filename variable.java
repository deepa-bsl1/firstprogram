public class variable
{
public static double salary=2000.50;

private static String lastname="Rahul";

private String age;

public static void main(String[]args)
{
int age=28;
variable var1=new variable();
variable var2=new variable();
variable var3=new variable();



System.out.println("age is "+age);
System.out.println("Salary is "+salary);
System.out.println("LastName is" +lastname);

age=32;
var2.salary=3500.75;
var3.lastname="Gandhi";

System.out.println("age=" +age);
System.out.println("Salary=" +var1.salary);
System.out.println("Salary=" +var2.salary);
System.out.println("Salary=" +var3.salary);
System.out.println("LastName=" +var1.lastname);
System.out.println("LastName=" +var2.lastname);
System.out.println("LastName=" +var3.lastname);
}
}

