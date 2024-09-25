import java.util.Scanner;
class product
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String name;
float tot,pri,q,dis,bill;
System.out.print("enter name,price,qua,dis");
name=s.nextLine();
pri=s.nextFloat();
q=s.nextFloat();
dis=s.nextFloat();
tot=pri*q;
bill=tot-dis;
System.out.print("tot="+tot+"bill="+bill);

}
}