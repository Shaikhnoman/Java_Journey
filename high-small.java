
class high-small
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n1,n2,n3,high,small;
System.out.print("enter no");
n1=s.nextInt();
n2=s.nextInt();
n3=s.nextInt();
high=Math.max(n1,Math.max(n2,n3));
small=Math.min(n1,Math.min(n2,n3));
System.out.print("high="+high+"smallest="+small);

}
}