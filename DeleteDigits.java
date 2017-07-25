import java.util.*;
class DeleteDigits
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        String st=sc.next();
        int k=sc.nextInt();
        char ch[]=st.toCharArray();
        Arrays.sort(ch);
        for(int i=0;i<st.length()-k;i++)
            System.out.print(ch[i]);
    }
}
