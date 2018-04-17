import java.time.*;
import java.util.*;
import java.io.*;

public class Serialization
{
    class Car()
    {
        String name;
        int mileage;
        LocalDate manufacturing_date;
        int price;
        Car(String n, int mlg, String mndate, int pri)
        {
            name = n;
            mlg = mileage;
            manufacturing_date = LocalDate.parse(mndate);
            price = pri;
            
        }
    }
    public static void main(String [] args)
    {

    }
}