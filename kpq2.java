class a extends Thread
{
public void run()
{
for(int i=0;i<=5;i++)
{
System.out.print("thread a="+i);
}
}
}
class b extends Thread
{
public void run()
{
for(int j=0;j<=5;j++)
{
System.out.print("thread b="+j);
}
}
}
class c extends Thread
{
public void run()
{
for(int k=0;k<=5;k++)
{
System.out.print("thread c="+k);
}
}
}
class kpq2
{
public static void main(String args[])
{
a x=new a();
b y=new b();
c z=new c();
y.setPriority(7);
x.start();
y.start();
z.start();
}
}