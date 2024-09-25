import java.util.Scanner;
class arrayneg
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
}
int c1=0,c2=0,c3=0;
for(int x:a)
{
if(x>0)
c1++;
else if(x<0)
c2++;
else
c3++;
}
System.out.print("+ve="+c1+"-ve="+c2+"zero="+c3);
}}