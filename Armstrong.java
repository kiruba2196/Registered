import java.util.Scanner;
    public class Armstrong
    {
        public static void main(String args[])
        {
        	Scanner sc=new Scanner(System.in);
        	int num=sc.nextInt();
        	int res=0,dup=num;
        	while(num>0)
        	{
        		int rem=num%10;
        		res=res+(rem*rem*rem);
        		num=num/10;
        	}
        	if(res==dup)
        		System.out.println("True");
        	else
        		System.out.println("False");
        		
        }
    }
