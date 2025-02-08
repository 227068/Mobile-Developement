import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileConverter {
    public static void main(String[] args) {
        String inputFilePath = "input.txt";  // Укажите путь к исходному файлу
        String outputFilePath = "output.txt"; // Укажите путь к выходному файлу

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toUpperCase());
                writer.newLine();
            }
            System.out.println("Файл успешно преобразован и записан.");
        } catch (IOException e) {
            System.err.println("Произошла ошибка при обработке файлов: " + e.getMessage());
        }
    }
}
