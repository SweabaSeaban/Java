import java.io.*;
public class Sumdigit
{
    public static void main(String args[])
    {
        try
        {
            String str1;
            int x,sum=0,rem=0;
            DataInputStream dis=new DataInputStream(System.in);
            System.out.println("Enter X:");
            str1=dis.readLine();
            x=Integer.parseInt(str1);
            while (x>0)
            {
                rem=x%10;
                sum+=rem;
                x=x/10;
            }
            System.out.println("Sum of digits="+sum);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}