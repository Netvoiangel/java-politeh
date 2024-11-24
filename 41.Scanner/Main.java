import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Укажите путь к вашему текстовому файлу
        File file = new File("example.txt");

        // Создаем объект Scanner для чтения данных из файла
        try (Scanner scanner = new Scanner(file)) {
            // Читаем строки из файла, пока не достигнем конца файла
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line); // Выводим прочитанную строку на экран
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
