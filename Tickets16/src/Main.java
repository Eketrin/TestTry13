import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Здесь указываем путь к файлу напрямую
        String filePath = "C:/Users/sofia/Desktop/Tickets15/textfile.txt";  // Замените на нужный путь

        try {
            // Считываем все строки из файла
            List<String> lines = Files.readAllLines(Paths.get(filePath));

            // Подсчитываем количество строк
            int totalLines = lines.size();
            System.out.println("Total number of lines: " + totalLines);

            // Находим самые длинные строки
            int maxLength = 0;
            for (String line : lines) {
                maxLength = Math.max(maxLength, line.length());
            }

            System.out.println("Longest lines:");
            for (String line : lines) {
                if (line.length() == maxLength) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
