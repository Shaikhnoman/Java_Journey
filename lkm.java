import java.util.Scanner;
class radius
{
float r;
Scanner s=new Scanner(System.in);
void get1()
{
System.out.print("enter radius");
r=s.nextFloat();
}
}
class circle extends radius
{
float a,p;
void show()
{
p=2*3.14f*r;
a=3.14f*r*r;
System.out.print("area="+a+"peri="+p);
}
}
class cylinder extends radius
{
float h,ar,r;
void get2()
{
System.out.print("enter radius,h");
h=s.nextFloat();
r=s.nextFloat();

}
void show()
{
ar=3.14f*r*r*h;
System.out.print("area of cylinder="+ar);
}
}

class lkm
{
public static void main(String args[])
{
circle x=new circle();
x.get1();
x.show();
cylinder y=new cylinder();
y.get2();
y.show();
}
}