import java.util.*;
public class TallestStudent {
	public static void main(String arg[])
    {
        int count;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of students ");
        int k=sc.nextInt();
        int arr[]=new int[k];
        System.out.println("Enter the heigth of students ");
        for(int i=0;i<k;i++)
        	arr[i]=sc.nextInt();
        System.out.println("Enter the value of k ");
        int n=sc.nextInt();
        Arrays.sort(arr);
        System.out.println("4th tallest student "+arr[arr.length-4]);
        System.out.println("Tallest student of "+n+" is "+arr[arr.length-n]);
    }
}
