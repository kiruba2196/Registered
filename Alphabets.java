import java.util.*;
public class Alphabets {
	public static void main(String arg[])
    {
		Scanner sc=new Scanner(System.in);
        String k=sc.next();
        if(k.equals("a") || k.equals("e") || k.equals("i") || k.equals("o") || k.equals("o"))
        System.out.println("Given character is vowel");
        else
        System.out.println("Given character is consonant");
    }
}
