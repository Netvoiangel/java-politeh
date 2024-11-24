import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamExample {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            // Записываем байт в файл
            fos.write(65); // Запишем символ 'A' (код 65)
            fos.write(66); // Запишем символ 'B' (код 66)
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
