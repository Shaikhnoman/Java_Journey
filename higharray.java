import java.util.Scanner;
class findele
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a[],n,i;
System.out.print("enter size");
n=s.nextInt();
a=new int[n];
System.out.print("enter elements");
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
System.out.print("enter ele to find");
int key=s.nextInt();
if(key==a[i])
{
int pos=i;
}
System.out.print("element found at"+i);
break;
}
}
if(i==n)
{
System.out.print("ele not found");

}
}}