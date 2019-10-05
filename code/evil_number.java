import java.util.*;
public class evil_number
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int count=0;
        for(int i=7;i>=0;i--)
        {
            if(((num>>i)&1) == 1)
            count++;
        }
        if(count%2==0)
        System.out.println("An Evil Number!!!");
        else
        System.out.println("Not an Evil Number!!!");
    }
}
