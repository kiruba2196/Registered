import java.util.*;
public class Letters {
	public static void main(String arg[])
    {
		Scanner sc=new Scanner(System.in);
        String k=sc.next();
        if(Character.isLetter(k.charAt(0)))
        System.out.println("Given input is alphabet");
        else
        System.out.println("Given input is not alphabet");
    }
}
