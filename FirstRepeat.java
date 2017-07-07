import java.util.Scanner;

public class FirstRepeat {
public static void main(String arg[])
{
	int i,j,count=0;
	Scanner sc=new Scanner(System.in);
	String inp=sc.next();
	char ch[]=inp.toCharArray();
	for(i=0;i<ch.length;i++)
	{
		for(j=0;j<ch.length;j++)
		{
			if(ch[i]==ch[j] && i!=j)
			count++;
		}
		if(count!=0)
		{
		System.out.println(ch[i]);
		break;
		}
		else
		count=0;
	}
}
}
