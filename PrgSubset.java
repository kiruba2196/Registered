import java.util.Scanner;

public class PrgSubset {

	public static void main(String[] args) {
		int i,j,count=0;
		boolean flag=false;
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		for(i=0;i<a.length()-2;i++)
		{
			for(j=0;j<b.length()-2;j++)
			{
				if(a.substring(i,i+2).equals(b.substring(j,j+2)))
					flag=true;
			}
		}
		if(flag==true)
			System.out.println("True");
		else
			System.out.println("False");

	}

}
