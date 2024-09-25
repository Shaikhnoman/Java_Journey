import java.util.Scanner;
 public class ArithmaticOperation 
{ public static void main(String[] args)
 {
 Scanner input= new Scanner (System.in);
 int number1;
 int number2;
 int sum, sub,mul;
 float div; 
System.out.print("enter frist integer: "); 
number1=input.nextInt();
 System.out.print("enter second integer: "); 
number2=input.nextInt(); 
sum=number1+number2; 
sub=number1-number2;
 mul=number1* number2; div=number1/number2;
 System.out.printf("sum is %d\n",sum); 
System.out.printf("sub is %d\n",sub);
 System.out.printf("mul is %d\n",mul); 
System.out.printf("div is %f\n",div); 
} 
}