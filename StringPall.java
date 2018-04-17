import java.util.*;
public class StringPall
{
  public static void main(String [] arg)
  {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    StringBuilder scopy = new StringBuilder(s);
    scopy.reverse();
  /*  String r = rev.toString();
    if(r.equals(s))
    {
      System.out.println("Pallendrom");
    }
    else
    {
      System.out.println("Not Pallendrom");
    }
*/
  String g = scopy.toString();
//  String g2 = rev.toString();
  System.out.println(scopy);
  //System.out.println(g2);
  }
}
