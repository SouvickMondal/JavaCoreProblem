import java.time.*;
public class DateOfBirthCalculator
{
  public static void main(String...s)
  {
    System.out.println("Enter Your Date of Birth:-  ");
    LocalDate day = LocalDate.now();
    LocalDate dateofbirth = LocalDate.parse("1997-09-01");
    int year,mon,day1;
    year = Period.between(dateofbirth,day).getYears();
    mon = Period.between(dateofbirth,day).getMonths();
    day1 = Period.between(dateofbirth,day).getDays();
    System.out.println("My age is "+year+" Years "+mon+" Months "+day1+" Days.");
  }
}
