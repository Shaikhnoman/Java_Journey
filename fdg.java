import java.util.Scanner;
class emp
{
String name;
int age;
float sal;
static float sum;
static int count;
 
void get()
{
Scanner s=new Scanner(System.in);
System.out.print("enter nmae,age,sal");
name=s.nextLine();
age=s.nextInt();
sal=s.nextFloat();
sum+=sal;
if(age<=50)
{
count++;
}
}
void put()
{
System.out.print("name="+name+"age="+age+"sal="+sal);
}
static void print()
{
System.out.print("sum="+sum+"count="+count);
}
class fdg
{
public static void main(String args[])
{
emp a[]= new emp[10];
for(int i=0;i<10;i++)
{
a[i]=new emp();

}
for(int i=0;i<10;i++)
{
a[i].put();
}
emp.print();
}
}
}