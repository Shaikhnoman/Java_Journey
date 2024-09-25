public class Calculatesum

 {
 public static void main( String args[] )
{
  int sum;
int i;
i = 1; 
sum = 0; 

 while ( i <= 10 ) 
 {
 sum += i; 
 ++i;
 } 

 System.out.printf( "The sum is: %d\n", sum );
 } 
 }