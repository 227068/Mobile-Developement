public class DateComparison {
    public static void main(String[] args) {
        // Пример использования метода
        LocalDate date1 = LocalDate.of(2023, 5, 15);
        LocalDate date2 = LocalDate.of(2023, 5, 20);

        String result = compareDates(date1, date2);
        System.out.println(result);
    }

    public static String compareDates(LocalDate date1, LocalDate date2) {
        if (date1.isBefore(date2)) {
            return date1 + " меньше " + date2;
        } else if (date1.isAfter(date2)) {
            return date1 + " больше " + date2;
        } else {
            return date1 + " равна " + date2;
        }
    }
}
