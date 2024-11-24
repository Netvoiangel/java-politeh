import java.util.*;

public class DateFormatterExample {
    public static void main(String[] args) {
        // Текущая дата и время
        Date now = new Date();

        // Создаем объект Formatter
        Formatter formatter = new Formatter();

        // Пример использования спецификаторов времени и даты

        // 1. %tY — Год в четырехзначном формате
        formatter.format("Year: %tY\n", now);

        // 2. %tB — Полное название месяца
        formatter.format("Month: %tB\n", now);

        // 3. %tA — Полное название дня недели
        formatter.format("Day of the week: %tA\n", now);

        // 4. %tI — Час в 12-часовом формате
        formatter.format("Hour (12-hour format): %tI\n", now);

        // 5. %tM — Минуты в двухзначном формате
        formatter.format("Minutes: %tM\n", now);

        // Выводим результат
        System.out.println(formatter.toString());

        // Закрываем объект formatter
        formatter.close();
    }
}
