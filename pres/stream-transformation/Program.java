import java.util.ArrayList;
import java.util.Collections;

public class Program {

    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<String>();
        Collections.addAll(cities, "Париж", "Лондон", "Мадрид", "Берлин", "Рим", "Дублин", "Прага");

        cities.parallelStream()
            .filter(s -> {
                System.out.println("Обработка " + s + " в " + Thread.currentThread().getName());
                return s.length() == 6;
            }) 
            .forEach(s -> System.out.println("Результат: " + s));
    }
}

