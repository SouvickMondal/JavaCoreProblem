import java.io.*;
public class Exception2
{
    public static void main(String [] arg)
    {
        BufferedReader reader = null;
        int total = 0;
        try
        {
            String line = null;
            reader = new BufferedReader(new FileReader("G:\\Study\\LpuSem4\\java\\BrainStroming\\numbers.txt"));
            while((line = reader.readLine()) != null)
            {
                total += Integer.parseInt(line);
            }
            System.out.println("Sum of the Numbers is: "+total);
        }
        catch(Exception e)
        {
            System.out.println("Error : "+e.getMessage());
        }
        finally
        {
            try
            {
                if(reader != null)
            {
                reader.close();
            }
            }
            catch(Exception r)
            {
                System.out.println("Error : "+r.getMessage());
            }    

        }

    }
}