import java.util.*;
public class LongestPalindrome
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        String inp=sc.next();
        int i,j,count=0,min=-1;
        String res=" ";
        int len=inp.length();
        for(i=0;i<len;i++)
        {
            for(j=i+2;j<len+1;j++)
            {
                String sub=inp.substring(i,j);
                StringBuffer sb=new StringBuffer(sub);
                sb.reverse();
                String rev=String.valueOf(sb);
                if(sub.equals(rev))
                {
                if(sub.length()>min)
                {
                min=sub.length();
                res=sub;
                }
                }
            }
        }
        System.out.println(res);
    }
}
