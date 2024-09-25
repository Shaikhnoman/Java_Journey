import java.util.Scanner;
class employ
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String name;
int bs;
float da,hr,ta,sal;
System.out.print("enter name,price,qua,dis");
name=s.nextLine();
bs=s.nextInt();
da=bs*150/100;
ta=bs*7/100;
hr=bs*13/100;
sal=da+ta+hr+bs;

System.out.print("bs="+bs+"da="+da+"ta="+ta+"hr="+hr+"sal="+sal);

}
}