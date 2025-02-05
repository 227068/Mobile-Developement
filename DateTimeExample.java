import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {
    public static void main(String[] args) {
        // Создаем объект LocalDate для текущей даты
        LocalDate currentDate = LocalDate.now();

        // Создаем объект LocalTime для текущего времени
        LocalTime currentTime = LocalTime.now();

        // Форматируем дату и время
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        // Выводим значения
        System.out.println("Текущая дата: " + currentDate.format(dateFormatter));
        System.out.println("Текущее время: " + currentTime.format(timeFormatter));
    }
}
