import java.util.Scanner;
class prog1
{
public static void main(String args[])
{
Scanner s=new Scanner(system.in);
int a,b,c,sum,pro;
float avg;
System.out.print("enter values of a,b,c");
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();                                                            output:
sum=a+b+c;
pro=a*b*c;
avg=sum/3.f;
if(a>b &&a>c)
System.out.println("largest="+a);
else if(b>a && b>c)
System.out.println("largest="+b);
else
System.out.println("largest="+b);
if(a<b && a<c)
System.out.println("smallest="+a);
else if(b<a && b<c)
System.out.println("smallest="+b);
else 
System.out.println("larggest="+c);
System.out.println("sum="+sum+"pro="=+pro+"avg="+avg);
}
}
