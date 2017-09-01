    import java.util.Scanner;
    public class FindPower 
    {
        public static void main(String args[])
        {
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Enter the x value ");
        	int n=sc.nextInt();
        	System.out.println("Enter the y value ");
        	int m=sc.nextInt();
        	System.out.println("Value of x^y is ");
       		System.out.println(Math.pow(n,m));

        }
    }
