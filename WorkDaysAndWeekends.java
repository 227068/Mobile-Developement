import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
public class WorkDaysAndWeekends {
    public static void printMonthDays(int year, int month) {
        YearMonth yearMonth = YearMonth.of(year, month);
        LocalDate firstDayOfMonth = yearMonth.atDay(1);
        LocalDate lastDayOfMonth = yearMonth.atEndOfMonth();

        for (LocalDate date = firstDayOfMonth; !date.isAfter(lastDayOfMonth); date = date.plusDays(1)) {
            DayOfWeek dayOfWeek = date.getDayOfWeek();
            boolean isWeekend = dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY;
            String typeOfDay = isWeekend ? "Выходной" : "Рабочий день";
            System.out.println(date + " - " + typeOfDay);
        }
    }

    public static void main(String[] args) {
        int year = 2025;
        int month = 2;
        printMonthDays(year, month);
    }
}
