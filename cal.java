import java.util.Scanner;
class cal
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
float x,y,z; 
System.out.print("enter x,y");
x=s.nextFloat();
y=s.nextFloat();
z=Math.exp(x)*(double)Math.sin(Math.sqrt(x-Math.lpow(y,3)));

System.out.print("z="+z);
}
}