import java.util.Scanner;
class radius
{
float r;
Scanner s=new Scanner(System.in);
void get()
{
System.out.print("enter radius");
r=s.nextFloat();
}
}
interface pi
{
float pi=3.14f;

}
class circle extends radius implements pi
{
float a,p;
void put()
{
a=pi*r*r;
p=2*pi*r;
System.out.print("area="+a+"peri="+p);
}
}
class qwe
{
public static void main(String args[])
{
circle c=new circle();
c.get();

c.put();
}
}

