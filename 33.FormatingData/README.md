
### Практика #2: Зачем нужен метод `flush()`?

Метод `flush()` используется для немедленного вывода всех накопленных данных в потоке. Он сбрасывает буфер, если данные находятся в буферизированном потоке (например, в `BufferedWriter`, `PrintWriter`, `Formatter`). Важно, что после вызова `flush()` данные становятся доступными для дальнейшего использования, например, для записи в файл или на экран.

Пример:

```java
import java.io.*;

public class FlushExample {
    public static void main(String[] args) throws IOException {
        PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));

        writer.print("Hello, ");
        writer.print("world!");
        writer.flush();  // Сбрасываем данные в файл немедленно

        writer.close();
    }
}
```

В данном примере, данные будут записаны в файл немедленно после вызова `flush()`.

