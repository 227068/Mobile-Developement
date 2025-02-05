import java.util.HashMap;
import java.util.Map;

public class SeasonsName {
    public static void main(String[] args) {
        // Примеры использования метода
        System.out.println(getSeasonName(1)); // Зима
        System.out.println(getSeasonName(2)); // Весна
        System.out.println(getSeasonName(3)); // Лето
        System.out.println(getSeasonName(4)); // Осень
        System.out.println(getSeasonName(5)); // Некорректный номер сезона
    }

    public static String getSeasonName(int seasonNumber) {
        Map<Integer, String> seasons = new HashMap<>();
        seasons.put(1, "Зима");
        seasons.put(2, "Весна");
        seasons.put(3, "Лето");
        seasons.put(4, "Осень");

        return seasons.getOrDefault(seasonNumber, "Некорректный номер сезона");
    }
}

