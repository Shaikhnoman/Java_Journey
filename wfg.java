import java.util.Scanner;
class fact
{
int fac=1,i,n;
Scanner s=new Scanner(System.in);
void fact()
{
System.out.print("enter no");
n=s.nextInt();
}
void calci()
{
for(i=0;i<=n;i++)
{
fac=fac*i;
}

}
}
class wfg
{
public static void main(String args[])
{
fact x=new fact();
x.fact();
x.calci();
System.out.print("factorial="+x.calci());
}
}

