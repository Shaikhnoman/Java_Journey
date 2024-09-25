import java.util.Scanner;
class ssum
{
public static void main(String args[])
{
Scanner s =new Scanner(System.in);
int a,b,c,sum;
float avg;
System.out.print("enter a,b,c");
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
sum=a+b+c;
avg=sum/3;
System.out.print("sum="+sum+"avg=s"+avg);
}}