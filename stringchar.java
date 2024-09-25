import java.util.Scanner;
class stringchar
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String s1,s2;
System.out.print("enter 2 string");
s1=s.nextLine();
s2=s.nextLine();
int i,c=0;
char ch=s2.charAt(0);
for(i=0;i<s1.length();i++)
{
int p=s1.indexOf(ch,i);
if(p==-1)
break;
else
{
System.out.print(p);
c++;
i=p;
}
}
}
}