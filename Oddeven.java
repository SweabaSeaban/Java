import java.io.*;
public class Oddeven
{
    public static void main(String args[])
    {
        try
        {
            String str1;
            int x;
            DataInputStream dis=new DataInputStream(System.in);
            System.out.println("Enter X:");
            str1=dis.readLine();
            x=Integer.parseInt(str1);
            if (x%2==0)
                System.out.println(x+" is an even number");
            else
            System.out.println(x+" is an odd number");
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}