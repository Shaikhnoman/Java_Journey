class sumavg
{
public static void main(String args[])
{
 int sum=0,i;
 
 for(i=0;i<=args.length;i++)
{
 sum=sum+Integer.valueOf(args[i]);
 }
float avg=sum/(float)args.length;
    System.out.print("sum="+sum+"avg="+avg);
}
}