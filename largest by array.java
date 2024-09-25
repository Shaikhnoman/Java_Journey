import java.util.Scanner;
 class largest
 public static void main (string args[])
{
   Scanner input=new Scanner(System.in);

int larg;
int i;
int a[]=new int[10];
sytem.out.printf("enter array elements");
   for (i=0;i<10;i++)
{
     a[i]=input.nextInt();
 }
larg=a[0];
  for(i=1;i<10,i++)
{
 if(a[i]>larg)
  {
    larg=a[i];
    }
        Sytem.out.printf("largest element=%d",larg);
}
}