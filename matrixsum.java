import java.util.Scanner;
class squarematrixsum
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a[][],m;
int i,j,sum=0;
System.out.print("enter size");
m=s.nextInt();
a=new int [m][m];
System.out.print("enter metrix");
for(i=0;i<m;i++)
{
 for(j=0;j<m;j++)
{
a[i][j]=s.nextInt();
 sum+=a[i][j];

}
System.out.print("sum="+sum);
}}
}