import java.time.*;
import java.util.*;
import java.io.*;
public class Exam3
{
    public static void main(String [] arg)
    {

        Train t1 = new Train(100,"sunday","monday");
        Train t2 = new Train(200,"tuesday","wednesday");
        Train t3 = new Train(300,"friday","satday");
        int t_number;
        String t_day;
        //System.out.println(t2.train_number);
        System.out.println("Enter the Train Number: ");
        Scanner sc = new Scanner(System.in);
        t_number = sc.nextInt();

        System.out.println("\nEnter the Day of Journey: \n All in Small Letter\nDay:  ");
        t_day = sc.nextLine();
        try
        {
            ObjectInputStream ob = new ObjectInputStream(new FileInputStream("traindata.txt"));
            ob.writeObjects(t1);
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        

        

    }
}

class Train
{
    int train_number;
    String  day1;
    String  day2;
    Train(int tn, String d1, String d2)
    {
        this.train_number = tn;
        this.day1 = d1;
        this.day1 = d2;
    }
    //LocalDate date = LocalDate.parse(date_string);

}