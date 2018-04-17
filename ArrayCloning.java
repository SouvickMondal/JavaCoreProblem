import java.util.*;
public class ArrayCloning
{
  public static void main(String [] args)
  {
    int [] arr1 = {2,3,4,5};
    int [] arr2 = arr1.clone();
    arr2[2] = 10;
    for(int i = 0; i<4; i++)
    {
      System.out.println(arr2[i]);
    }
  }
}
