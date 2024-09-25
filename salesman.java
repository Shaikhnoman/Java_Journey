import java.util.Scanner;
class salesman
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String name[]=new String[10];
int sale[][]=new int[10][4];
int tot[]=new int[10];
float com[]=new float[10];
int sum=0,i,j;
System.out.print("enter name,sale in 4 state");
for(i=0;i<10;i++)
{
tot[i]=0;
name[i]=s.next();
for(j=0;j<4;j++)
{
sale[i][j]=s.nextInt();
tot[i]+=sale[i][j];

com[i]=tot[i]+(20/100);
sum+=com[i];
}
}
for(i=0;i<10;i++)
{
System.out.print(name[i]+tot[i]+com[i]);
}
System.out.print("sum="+sum);
}
}
