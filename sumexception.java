class sumexception
{
public static void main(String args[])
{
int i,sum=0;
float avg=1;
try
{
for(i=0;i<args.length;i++)
{
sum+=Integer.valueOf(args[i]);
avg=sum/(float)args.length;
}
System.out.print("sum="+sum+"avg="+avg);
}

catch(ArithmeticException e)
{
System.out.print("excetion ari");
}
catch(NumberFormatException e)
{
System.out.print("excetion no");
}
}
}