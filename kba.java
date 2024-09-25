import java.util.Scanner;
class emp
{
String name;
int ecode,sal;
Scanner s=new Scanner(System.in);
void gete()
{
System.out.print("enter radius");
name=s.nextLine();
ecode=s.nextInt();
sal=s.nextInt();
}
}
class dept extends emp
{
String dname,post;
void getd()
{
System.out.print("enter dname,post");
dname=s.nextLine();
post=s.nextLine();
}
}
class netsal extends dept
{
float it,net;
void calci()
{
it=sal*10/100f;
net=sal-it;
}
void show()
{
System.out.print("name="+name+"ecode="+ecode+"sal="+sal+"dept="+dname+"post="+post+"it="+it+"net sal="+net);
}
}
class kba
{
public static void main(String args[])
{
netsal n=new netsal();
n.gete();
n.getd();
n.calci();
n.show();
}
}

