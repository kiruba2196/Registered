import java.util.Scanner;
    public class NumberSeed
    {
        public static void main(String args[])
        {
        	Scanner sc=new Scanner(System.in);
        	int num=sc.nextInt();
        	int res=1,dup=num;
        	while(num>0)
        	{
        		int rem=num%10;
        		res=res*rem;
        		num=num/10;
        	}
        		System.out.println(res*dup);
        }
    }
