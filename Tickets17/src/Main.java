import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Жестко указанные пути к файлам
        String inputFile1 = "C:/Users/sofia/Desktop/Tickets16/inputFile1.txt"; // Путь к первому входному файлу
        String inputFile2 = "C:/Users/sofia/Desktop/Tickets16/inputFile2.txt"; // Путь ко второму входному файлу
        String outputFile = "C:/Users/sofia/Desktop/Tickets16/outputFile.txt"; // Путь к выходному файлу

        try {
            // Считываем содержимое первого файла
            List<String> lines1 = Files.readAllLines(Paths.get(inputFile1));
            // Считываем содержимое второго файла
            List<String> lines2 = Files.readAllLines(Paths.get(inputFile2));

            // Объединяем содержимое обоих файлов
            lines1.addAll(lines2);

            // Записываем объединенное содержимое в выходной файл
            Files.write(Paths.get(outputFile), lines1, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.out.println("Files have been successfully merged into " + outputFile);

        } catch (IOException e) {
            System.out.println("Error reading or writing files: " + e.getMessage());
        }
    }
}
