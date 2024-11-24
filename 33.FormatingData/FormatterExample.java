import java.util.Formatter;

public class FormatterExample {
    public static void main(String[] args) {
        // Создаем объект Formatter
        Formatter formatter = new Formatter();

        // Пример использования различных спецификаторов формата

        // 1. %b — Логическое значение (true/false)
        boolean isJavaFun = true;
        formatter.format("Is Java fun? %b\n", isJavaFun);

        // 2. %d — Десятичное целое число
        int number = 42;
        formatter.format("The answer to life is %d\n", number);

        // 3. %f — Число с плавающей точкой
        double pi = 3.14159;
        formatter.format("Value of Pi: %f\n", pi);

        // 4. %s — Строковое представление
        String name = "Java";
        formatter.format("The name is %s\n", name);

        // 5. %% — Вставка знака процента
        formatter.format("Percentage: 50%%\n");

        // Выводим результат
        System.out.println(formatter.toString());

        // Закрываем объект formatter
        formatter.close();
    }
}
