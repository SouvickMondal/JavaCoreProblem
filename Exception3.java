import java.io.*;
import java.util.*;
class User{
    String name;
    String password;
    User(String n,String p)
    {
        this.name = n;
        this.password = p;

    }
}
public class Exception3
{
    public static void main(String [] arg)
    {
        System.out.println("Enter Your User Name: ");
        Scanner sc = new Scanner(System.in);
        String usrnm = sc.nextLine();
        System.out.println("Enter Your Password: ");
        String pwd = sc.nextLine();
        User user = new User(usrnm,pwd);
        PrintWriter writer = new PrintWriter("the-file-name.txt", "UTF-8");
writer.println("The first line");
writer.println("The second line");
writer.close();


    }


}