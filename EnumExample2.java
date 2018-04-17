import java.util.*;
public class EnumExample2
{
  public enum Day{
    SUNDAY("Sunday is a Holiday."),
    MONDAY("Monday is a Working day.");
    private String text;
    Day(String t)
    {
      this.text = t;
    }
    String display()
    {
      return text;
    }
  }

public static void main(String [] args)
{
  String s = "sunday";
  System.out.println(Day.valueOf(s.toUpperCase()).display());
}





}
