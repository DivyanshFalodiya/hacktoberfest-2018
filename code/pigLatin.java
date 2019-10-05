import java.util.*;
public class pigLatin
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toLowerCase();
        int index=-1;
        for(int i=0;i<s.length();i++)
        {
            if(check((s.charAt(i)))==1)
            {index=i;break;}
        }
        if(index==-1)
        System.out.println("No vowel in the given string!!");
        else if(index==0)
        System.out.println(s+"ay");
        else
        {
            System.out.println(s.substring(index)+s.substring(0,index)+"ay");
        }
    }
    public static int check(char ch)
    {
        switch(ch)
        {
        case 'a':return 1;
        case 'e':return 1;
        case 'i':return 1;
        case 'o':return 1;
        case 'u':return 1;
        default: return 0;
    }
    }
}
