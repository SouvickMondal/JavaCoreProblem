public class Exception1
{
    public static void main(String [] arg)
    {

        //Integer k = Integer.valueOf("123");
        float result;
        int a=6,b=0;
        /*result = a/b;
            System.out.println(result);*/
       // result = Float.parseFloat(arg[0])/Float.parseFloat(arg[1]);
        try
        {
            result = a/b;
            System.out.println(result);
            
        }
        catch(Exception e)
        {
            System.out.println("Error is: "+e.getMessage());
            e.printStackTrace();
        }
        
       finally
       {
           System.out.println("\nAfter the Exception.");
           
       
       }
        
       
    }
}