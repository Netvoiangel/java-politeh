import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("example.txt")) {
            int byteData;
            // Чтение данных побайтово
            while ((byteData = fis.read()) != -1) {
                System.out.print((char) byteData); // Преобразуем байт в символ
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
