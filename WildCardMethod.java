
public class WildCardMethod
{



public static void main(String [] args)
{
    Integer inums[] = { 1,2,3,4 };
    Double  dnums[] = {1.0,2.0,3.0,4.0};
    Stats<Integer> iob = new Stats<Integer>(inums);
    Stats<Double> dob = new Stats<Double>(dnums);
    
    if(iob.sameAvg(dob))
    {
        System.out.println("Average are the same");
    }
    else
    {
        System.out.println("Average differs");
    }


}


}


class Stats<T extends Number>
{
    T [] nums;
    Stats(T [] o)
    {
        nums = o;
    }

    double average()
    {
        double sum1 = 0.0;
        for(int i=0; i<nums.length; i++)
        {
            sum1 += nums[i].doubleValue();
            
        }
        return sum1/nums.length;
    }

    boolean sameAvg(Stats<? extends Number> ob)
{
    if(average()==ob.average())
    {
        return true;
    
    
    }
    else{
        return false;
    }
}
}





