import java .util.Scanner;
class volume
{
float v,s,r,h,l,b;
volume(float s)
{
v=s*s*s;
}
volume(float r,float h)
{
v=3.14f*r*r*h;
}
volume(float l,float b,float h)
{
v=l*b*h;
}
void put()
{
System.out.print("volume="+v);
}
}
class xyz2
{
public static void main(String args[])
{
volume v;
 v= new volume(3.4f);
v.put();
v= new volume(3.4f,5.6f);
v.put();
 v= new volume(3.4f,3.7f,2.5f);
v.put();
}
}