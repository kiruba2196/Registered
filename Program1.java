import java.util.*;
public class Program1 {
	public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        String[] arr=st.split(" ");
        for(int i=0;i<arr.length;i++)
        {
        	if(Integer.parseInt(arr[i])==i)
        	{
        		System.out.println(arr[i]);
        	}
        }
    }
}
