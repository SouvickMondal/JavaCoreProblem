import java.util.*;
public StringPallendrom
{
  public static void main(String [] arg)
  {
    Scanner sc = new Scanner(System.in);
    StringBuilder s = new StringBuilder();
    s = sc.nextLine();
    StringBuilder scopy = new StringBuilder();
    scopy = s;
    StringBuilder rev = s.reverse();
    if(rev == scopy)
    {
      System.out.println("Pallendrom")
    }

  }
}
