
import java.util.Scanner;
public class Calculation
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int num1,num2,add,sub,mul,div;
		System.out.print("Enter 1st number");
		num1=input.nextInt();
		System.out.print("Enter 2nd number");
		num2=input.nextInt();
		add=num1+num2;
		sub=num1-num2;
		mul=num1*num2;
		div=num1/num2;
		System.out.printf("Addition of 2 given numbers is %d\n",add);
		System.out.printf("Subtractionof 2 given numbers is %d\n",sub);
		System.out.printf("Multiplication 2 given numbers is %d\n",mul);
		System.out.printf("Division of 2 given numbers is %d\n",div);		
	}
}