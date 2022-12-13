import java.io.*;
public class Readnum
{
    public static void main(String args[])
    {
        try
        {
            String str1,str2;
            int x,y;
            DataInputStream dis=new DataInputStream(System.in);
            System.out.println("Enter X:");
            str1=dis.readLine();
            x=Integer.parseInt(str1);
            System.out.println("Enter Y:");
            str2=dis.readLine();
            y=Integer.parseInt(str2);
            System.out.println("X="+x);
            System.out.println("Y="+y);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}