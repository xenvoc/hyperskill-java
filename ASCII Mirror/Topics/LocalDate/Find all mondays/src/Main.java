import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner reader = new Scanner(System.in);
        int startingYear = reader.nextInt();
        int startingMonth = reader.nextInt();
        LocalDate startingDate = LocalDate.of(startingYear, startingMonth, 1);
        Calendar cal = Calendar.getInstance();
        Date date = Date.from(startingDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        cal.setTime(date);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        LocalDate firstMonday = startingDate;
        if (dayOfWeek == 1) firstMonday = firstMonday.plusDays(1);
        else if (dayOfWeek > 2) firstMonday = firstMonday.plusDays(9 - dayOfWeek);
        LocalDate thisMonthsLastDay = LocalDate.of(startingYear, startingMonth, startingDate.lengthOfMonth());
        for (LocalDate i = firstMonday;
             !i.isAfter(thisMonthsLastDay);
             i = i.plusDays(7)) {
            System.out.println(i);
        }



    }
}