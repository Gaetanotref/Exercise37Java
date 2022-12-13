import java.time.LocalDate;
import java.time.Year;

public class Main {
    public static void main(String[] args) {
        LocalDate myDate = LocalDate.now();
        int myDateMonthLength = myDate.getMonth().maxLength();
        int myDateDayOfMonth = myDate.getDayOfMonth();
        int tillEndOfMonth = myDateMonthLength - myDateDayOfMonth;
        System.out.println("There are "+tillEndOfMonth+" days left till the end of the month");

        int daysOfTheYear = Year.of(2022).length();
        int dayOfYearNow = myDate.getDayOfYear();
        int tillEndOfTheYear = daysOfTheYear-dayOfYearNow;
        System.out.println("There are "+tillEndOfTheYear+" days left till the end of the year");
    }
}