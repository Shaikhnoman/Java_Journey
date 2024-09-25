import java.util.Scanner;
class radius
{
int r;
Scanner s=new Scanner(System.in);
void get()
{
System.out.print("enter radius");
r=s.nextInt();
}
}
class circle extends radius
{
void put()
{
float a=3.14f*r*r;
float p=2*3.14f*r;
System.out.print("area="+a+"per="+p);
}
}
class fgj
{
public static void main(String args[])
{
circle x=new circle();
x.get();
x.put();
}
}

