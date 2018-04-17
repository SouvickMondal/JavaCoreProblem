
public class EnumExample
{
  public enum Season{Winter, Summer, Rainy}
  public static void main(String[] args) {
    for(Season s : Season.values())
    {
      System.out.println(s + " ");
    }

  }
}
