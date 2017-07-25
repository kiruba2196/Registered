public class Number
{
	public static void main(String args[])
	{
		int num=Integer.parseInt(args[0]);
		int ways=0,count[],i=0,n,j=0;
		count=new int[100];
		if(num>0)
			ways++;
		while(num>9)
		{
			n=(num%100);
			if((n<27)&&(n!=0))
			{
				ways++;
				count[i]=n;
				i++;
			}
			num/=10;
				
		}
		for(i=0;i<100;i++)
		{
		   for(j=i+2;j<100;j++)
		   {
		   if(count[j]!=0)
			ways++;	
		   else
			break; 
		   }
		}
		System.out.println(ways);

	}
}
