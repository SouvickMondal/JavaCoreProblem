import java.util.*;
import java.io.*;
public class file
{
    public static void main(String...sm)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the path of the folder: ");
        String p = sc.nextLine();


        System.out.println("Enter the extension ");
        String ext = sc.nextLine();
        File f = new File(p);
        File [] files = f.listFiles();
        int c = 0;
        for(File fl: files)
        {
            boolean e = fl.getName().endsWith(ext);

            if(e==true)
            {
                fl.delete();
                c = c + 1;
            }   
        }
        System.out.println(c +" number of Files are deleted.");
    }
}