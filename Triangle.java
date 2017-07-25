import java.util.Scanner;
public class Triangle
{
public static void main(String[] args)
{
int i,j,r=0,k=0,sum=0,res=0;
Scanner in = new Scanner(System.in);
int no=in.nextInt();

while(no>0)    
{
    sum=0;
    r=no;
    while(r>0)
    {
        k=r%10;
        sum=sum+k;
        r=r/10;
    }
    no=no/10;
    res=res+sum;
}
System.out.println(res);
}}
