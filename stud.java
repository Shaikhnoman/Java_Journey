import java.util.Scanner;
class stud
{
public static void main(String args[])
{
Scanner s =new Scanner(System.in);
String name,res;
byte s1,s2,s3;
int tot;
float per;
System.out.print("enter name,s1,s2,s3");
name=s.nextLine();
s1=s.nextByte();
s2=s.nextByte();
s3=s.nextByte();

tot=s1+s2+s3;
per=tot/3.0f;
if(s1>=35 && s2>=35 && s3>=35)
res="passed";
else
res="failedd";
System.out.print("res="+res+"sum="+tot+"per="+per);

}}