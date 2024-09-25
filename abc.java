import java.util.Scanner;
class add
{
String name,res;
int a,b,c,sum=0;
float per;
void get()
{
Scanner s=new Scanner(System.in);
System.out.print("enter 2 no");
name=s.nextLine();
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
sum+=a+b+c;
per=sum/3;
if(a>35 && b>35 && c>35)
res="passed";
else
res="failed";
}
void put()
{
System.out.print("sum="+sum+"per="+per+"res="+res);
}
}
class abc
{
public static void main(String args[])
{
add x=new add();
x.get();
x.put();
add y=new add();
y.get();
y.put();
}
}