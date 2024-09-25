class a implements Runable
{
public void run()
{
for(int i=0;i<=5;i++)
{
System.out.print("thread a="+i);
}
}
}
class b implements Runable
{
public void run()
{
for(int j=0;j<=5;j++)
{
System.out.print("thread b="+j);
}
}
}

class kpq3
{
public static void main(String args[])
{
a x=new a();
b y=new b();
Thread t1=new Thread(x);
Thread t2=new Thread(y);
t1.start();
t1.start();
}
}