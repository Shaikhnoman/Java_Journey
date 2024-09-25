class heighest
{
public static void main(String args[])
{
  int a=Integer.valueOf(args[0]);
  int b=Integer.valueOf(args[1]);
  int c=Integer.valueOf(args[2]);
  int d=Math.max(a,Math.max(b,c));
   System.out.print("heighst="+d);
}
}
