import java.util.Scanner;

public class TwoArraySubset {

	public static void main(String[] args) {
		int i,j,count=0;
		boolean flag=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the al elements");
		String a=sc.nextLine();
		System.out.println("Enter the a2 elements");
		String b=sc.nextLine();
		char[] a1=a.toCharArray();
		char[] a2=b.toCharArray();
		for(i=0;i<a1.length;i++)
		{
			count=0;
			for(j=0;j<a2.length;j++)
			{
				if(a1[i]==a2[j] && i!=j)
					count++;
			}
			if(count==0)
			{
				flag=true;
				break;
			}
		}
		if(flag==true)
			System.out.println("a1 is Not a subset of a2");
		else
			System.out.println("a1 is subset of a2");

	}

}
