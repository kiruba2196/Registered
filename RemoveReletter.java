import java.util.*;
public class RemoveReletter
{
    public static void main(String arg[])
    {
        int i,j,len;
        Scanner sc=new Scanner(System.in);
        String inp=sc.nextLine();
        char[] st=inp.toLowerCase().toCharArray();
        char[] st1=inp.toCharArray();
        len=st.length;
        for(i=0;i<len;i++)
        {
            if(st[i]!=' ') {
            for(j=i+1;j<len;j++)
            {
                if(st[i]==st[j])
                {
                    st[j]=' ';
                }
                
            }
        }
        }
        for(i=0;i<st.length;i++)
        {
            if(st[i]!=' ')
            {
                System.out.print(st1[i]);
            }
        }
    }
}







