import java.util.*;
public class StringToEnum
{
  public enum Day
  {
    SATURDAY("This is Sunday"),SUNDAY("This is Monday"),MONDAY("This is ")
  }
  public static void main(String...sm)
  {
    String s;
    Scanner sc = new Scanner(System.in);
    s = sc.nextLine();
    System.out.println(Day.valueOf(s.toUpperCase()));
  }
}
