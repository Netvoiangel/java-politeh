import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<String>();
        Collections.addAll(cities, "Париж", "Лондон", "Мадрид", "Берлин", "Рим", "Дублин", "Прага", "Токио");

        Map<Integer, List<String>> groupedByLength = cities.stream()
                .collect(Collectors.groupingBy(String::length));

        //результат группировки
        groupedByLength.forEach((length, cityList) -> {
            System.out.println("Длина: " + length);
            cityList.forEach(city -> System.out.println(" - " + city));
        });
    }
}

