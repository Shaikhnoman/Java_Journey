//Write a program that inputs five numbers and determines and prints the number of negative numbers input, the number of positive numbeinput and
the number of zeros input.//

import java. util. *;
class  prog3{
      public static void main(String args[ ]) {
         Scanner sc = new Scanner(System.in) ;
            int a[ ]= new int[5];
            int c1=0 , c2=0, c3=0;
             for(int i=0; i<5;i++) 
             { 
                 System. out. println("enter" + i+1 +" number") ;
                   a[i]= sc. nextInt() ;
                   if (a[i]==0) {
                     c1++;
                  }
                  else if(a[i]>0) {
                     c2++;
                   }
                     else{
                         c3++;
                     }
              }
  System. out. println("positive count ="  + c2 +" Negative count="  + c3 + " Zero count="  + c1) ;
 }
}

