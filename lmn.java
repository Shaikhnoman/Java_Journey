import java .util.Scanner;
class area
{
float r,a,l,b;
area(float r)
{
a=2*3.14f*r*r;
}
area(float k)
{
a=6*k*k;
}
area(float l,float b)
{
a=l*b;
}
void put()
{
System.out.print("area="+a);
}
}
class lmn
{
public static void main(String args[])
{
area a;
 a= new area(3.4f);
a.put();
a= new area(3.4f);
a.put();
 a= new area(3.4f,3.7f);
a.put();
}
}