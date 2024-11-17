import java.util.List;
import java.util.Optional;

public class Program {
    public static void main(String[] args) {
        List<String> strings = List.of("one", "two", "three");

        Optional<String> result = strings.stream()
                                         .filter(s -> s.length() > 5)
                                         .findAny();

        result.ifPresentOrElse(
            System.out::println,
            () -> System.out.println("Результат отсутствует")
        );
    }
}

