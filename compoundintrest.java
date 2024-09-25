import java.util.Scanner;
class compoundintrest
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n;
float ci,r,p;
System.out.print("enter p,r,n");
p=s.nextFloat();
r=s.nextFloat();
n=s.nextInt();
ci=p*Math.pow(((double)1+r/100),(double)n);
System.out.print("compound intrest="+ci);
}
}