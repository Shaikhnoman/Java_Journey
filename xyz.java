import java .util.Scanner;
class volume
{
float v,s,r,h,l,b;
void get(float s)
{
v=s*s*s;
}
void get(float r,float h)
{
v=3.14f*r*r*h;
}
void get(float l,float b,float h)
{
v=l*b*h;
}
void put()
{
System.out.print("volume="+v);
}
}
class xyz
{
public static void main(String args[])
{
volume v= new volume();
v.get(3.6f);
v.put();
v.get(6.2f,4.7f,5.4f);
v.put();
v.get(2.4f,4.7f);
v.put();
}
}