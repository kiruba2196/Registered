import java.util.*;
class UserID
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        String fname=sc.nextLine();
        String lname=sc.nextLine();
        String pin=sc.nextLine();
        int n=sc.nextInt();
        String s1=null,s2=null;
        String snam=" ";
        String lnam=" ";
        String sn="",ln="";
        String name[]=new String[2];
        if(fname.length()>lname.length())
        {
        snam=lname;
        lnam=fname;
        }
        else if(fname.length()<lname.length())
        {
        snam=fname;
        lnam=lname;
        }
        else if(fname.length()==lname.length())
        {
            name[0]=fname;
            name[1]=lname;
            Arrays.sort(name);
            snam=name[0];
            lnam=name[1];
        }
        byte b[]=snam.getBytes();
        for(int i=0;i<snam.length();i++)
        {
            if(b[i]>96)
            sn=sn+(char)(b[i]-32);
            if(b[i]<92)
            sn=sn+(char)(b[i]+32);
            
        }
        
        byte b2[]=lnam.getBytes();
        for(int i=0;i<lnam.length();i++)
        {
            if(b2[i]>96)
            ln=ln+(char)(b2[i]-32);
            if(b2[i]<92)
            ln=ln+(char)(b2[i]+32);
            
        }
        
        char ch1=pin.charAt(n-1);
        char ch2=pin.charAt(pin.length()-n);
        
        
        System.out.println(ln.charAt(0)+sn+ch1+ch2);
    }
}

