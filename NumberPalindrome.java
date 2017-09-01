    import java.util.Scanner;
    public class NumberPalindrome
    {
        public static void main(String args[])
        {
        	Scanner sc=new Scanner(System.in);
        	String n=sc.next();
        	StringBuffer sb=new StringBuffer(n);
        	String rev=String.valueOf(sb.reverse());
        	if(n.equals(rev))
        		System.out.println("Given no is Palindrome");
        	else
        		System.out.println("Given no is not Palindrome");
        }
    }
