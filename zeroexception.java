import java.util.Scanner;
class zeroexception2 
{
public static void main(String args[])
{
float a,b,c;
Scanner s=new Scanner(System.in);
try
{
System.out.print("enter 2 no");
a=s.nextFloat();
b=s.nextFloat();
c=a/b;
System.out.print("div="+c);
}
catch(ArithmeticException e)
{
System.out.print("excetion is div by zero");
}
catch(NumberFormatException e)
{
System.out.print("excetion is no foramt");
}
}
}