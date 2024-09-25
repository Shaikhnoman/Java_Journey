import java.util.*;
class ghj
{
public static void main(String args[])
{
fileInputStream in=new fileInputStream("xyz.java");
int ch;
while((ch=in.read())!=-1)
{
System.out.print((char)ch);
}
in.close();
}
}