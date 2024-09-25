import java.util.Scanner;
class circle1
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
float r,p,a;
System.out.print("enter radius");
r=s.nextInt();
a=2*3.14f*r*r;
p=2*3.14f*r;
System.out.print("area="+a+"peri="+p);
}
}