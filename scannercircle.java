import java.util.Scanner;
class scannercircle
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
double r,a,p;
System.out.print("enter value of r");
r=s.nextDouble();
a=3.14*r*r;
p=2*3.14*r;
System.out.print("are="+a+"per="+p);
}
}