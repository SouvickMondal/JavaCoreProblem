import java.time.*;
public class DateTimeAPI {
    public static void main(String...p)
    { LocalDate d = LocalDate.now();
            System.out.println(d);
            int m = d.getMonthValue();
            System.out.println(m);
            LocalDate date = LocalDate.parse("2018-02-22");
            System.out.println(date);
            LocalDate dateof = LocalDate.of(2007,01,25);
            System.out.println(dateof);
    }
}
