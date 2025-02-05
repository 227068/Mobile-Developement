import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DaysUntilNewYear {
    public static void main(String[] args) {
        long daysUntilNewYear = calculateDaysUntilNewYear();
        System.out.println("Количество дней до Нового года: " + daysUntilNewYear);
    }

    public static long calculateDaysUntilNewYear() {
        LocalDate today = LocalDate.now(); // Текущая дата
        LocalDate newYear = LocalDate.of(today.getYear() + 1, 1, 1); // Новый год следующего года

        // Вычисляем количество дней между текущей датой и Новым годом
        return ChronoUnit.DAYS.between(today, newYear);
    }
}