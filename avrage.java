public class Main {

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);

        int n, avg, i,sum=0;
        float avg = 0;
        

        System.out.println ("Enter the number of elements to calculate the average\n");

        n = in.nextInt();

        System.out.println ("\n Enter " n " elements \n");
        for(i = 0; i < n; i++)
        {

             sum=sum+i;
            avg= in.nextInt();
            
        }
        avg =sum/ n;
        System.out.println ("avrage= " avg);
    }
}