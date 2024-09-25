import java.util.Scanner;
class a
{
int a=6;
void show()
{
System.out.print("a="+a);
}
}
class b extends a
{
int b=15;
void show()
{
System.out.print("b="+b);
}
}
class eru
{
public static void main(String args[])
{
int r;

a x=new a();
b y=new b();
r=x;
r.show();
r=y;
r.show();
}
}