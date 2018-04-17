import java.util.*;
public class StaticVariable
{
  public static void main(String...sm)
  {
    StaticClass a = new StaticClass();
    StaticClass b = new StaticClass();
    a.x = 70;
    a.y = 20;
    b.x = 75;
    b.y = 25;
    System.out.println(a.x);
    System.out.println(a.y);
    System.out.println(b.x);
    System.out.println(b.y);
  }
}
class StaticClass
{
  public static int x = 7;
  public int y = 2;
}
