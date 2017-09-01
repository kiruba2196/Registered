import java.util.*;
public class StringRev {
	public static void main(String arg[])
    {
        int count;
		Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        String[] arr=st.split(" ");
        for(int i=0;i<arr.length;i++)
        {
        	System.out.print(arr[arr.length-1-i]);
        	if(i<arr.length)
        		System.out.print(" ");
        }
        
    }

}
