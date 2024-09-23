/**
 * Класс, демонстрирующий использование различных операторов в языке Java.
 */
public class OperatorExamples {
    
    public static void main(String[] args) {
        // Базовые типы
        int a = 5;
        int b = 10;
        boolean bool1 = true;
        boolean bool2 = false;
        String str1 = "Hello";
        String str2 = "World";

        // Оператор присваивания и арифметические операторы с присваиванием
        a = 15;        // Присваивание
        a += 5;        // Эквивалентно a = a + 5;
        b -= 3;        // Эквивалентно b = b - 3;
        b *= 2;        // Эквивалентно b = b * 2;
        b /= 2;        // Эквивалентно b = b / 2;
        b %= 3;        // Эквивалентно b = b % 3;

        // Тернарный оператор (?:)
        int min = (a < b) ? a : b;

        // Логические операторы ||, &&
        boolean result = bool1 || bool2;  // true, так как bool1 = true
        result = bool1 && bool2;          // false, так как bool2 = false

        // Побитовые операторы |, ^, &
        int bitOr = a | b;   // Побитовое ИЛИ
        int bitXor = a ^ b;  // Побитовое исключающее ИЛИ
        int bitAnd = a & b;  // Побитовое И

        // Операторы == и !=
        boolean isEqual = (a == b);  // false, так как a != b
        boolean isNotEqual = (a != b);  // true, так как a != b

        // Операторы сравнения >, >=, <, <=
        boolean isGreater = (a > b);  // true, если a больше b
        boolean isLessEqual = (a <= b);  // false, если a больше b

        // Побитовые сдвиги >>, >>>, <<
        int rightShift = a >> 2;     // Сдвиг вправо с сохранением знака
        int unsignedRightShift = a >>> 2; // Беззнаковый сдвиг вправо
        int leftShift = a << 2;      // Сдвиг влево

        // Операторы + и -
        int sum = a + b;   // Сложение
        int diff = a - b;  // Вычитание

        // Операторы *, / и %
        int product = a * b;   // Умножение
        int quotient = a / b;  // Деление
        int remainder = a % b; // Остаток от деления

        // Префиксные и постфиксные операторы ++ и --
        int preIncrement = ++a; // Префиксный инкремент (сначала увеличит, потом вернет)
        int postIncrement = b++; // Постфиксный инкремент (сначала вернет, потом увеличит)
        int preDecrement = --a;  // Префиксный декремент
        int postDecrement = b--; // Постфиксный декремент

        // Операторы для строк
        String concatenation = str1 + " " + str2;  // Конкатенация строк
        str1 += " Java";  // Конкатенация с присваиванием

        // Логические операторы == и != для строк
        boolean strEqual = (str1 == str2);  // Сравнение ссылок
        boolean strNotEqual = (str1 != str2);  // Сравнение ссылок

        // Демонстрация приоритета операторов с помощью скобок
        int complexExpression = (a + b) * (b - a); // Сначала сложение и вычитание, затем умножение

        // Пример использования instanceof
        Object obj = str1;
        if (obj instanceof String) {
            System.out.println("obj является экземпляром String");
        }

        // Пример использования instanceof с null-значением
        obj = null;
        if (obj instanceof String) {
            System.out.println("Этот код не выполнится");
        } else {
            System.out.println("obj является null и не является экземпляром String");
        }

        // Вывод результатов
        printResults(a, b, min, result, bitOr, bitXor, bitAnd, isEqual, isNotEqual, isGreater, isLessEqual, rightShift, unsignedRightShift, leftShift, sum, diff, product, quotient, remainder, preIncrement, postIncrement, preDecrement, postDecrement, concatenation, strEqual, strNotEqual, complexExpression);
    }

    /**
     * Вывод результатов на консоль.
     *
     * @param a первое целое число
     * @param b второе целое число
     * @param min минимальное значение из a и b
     * @param result результат логических операций
     * @param bitOr результат побитового ИЛИ
     * @param bitXor результат побитового исключающего ИЛИ
     * @param bitAnd результат побитового И
     * @param isEqual результат проверки равенства
     * @param isNotEqual результат проверки неравенства
     * @param isGreater результат проверки "больше"
     * @param isLessEqual результат проверки "меньше или равно"
     * @param rightShift результат сдвига вправо
     * @param unsignedRightShift результат беззнакового сдвига вправо
     * @param leftShift результат сдвига влево
     * @param sum результат сложения
     * @param diff результат вычитания
     * @param product результат умножения
     * @param quotient результат деления
     * @param remainder результат операции остатка от деления
     * @param preIncrement результат префиксного инкремента
     * @param postIncrement результат постфиксного инкремента
     * @param preDecrement результат префиксного декремента
     * @param postDecrement результат постфиксного декремента
     * @param concatenation результат конкатенации строк
     * @param strEqual результат проверки равенства строк
     * @param strNotEqual результат проверки неравенства строк
     * @param complexExpression результат сложного выражения
     */
    public static void printResults(int a, int b, int min, boolean result, int bitOr, int bitXor, int bitAnd, boolean isEqual, boolean isNotEqual, boolean isGreater, boolean isLessEqual, int rightShift, int unsignedRightShift, int leftShift, int sum, int diff, int product, int quotient, int remainder, int preIncrement, int postIncrement, int preDecrement, int postDecrement, String concatenation, boolean strEqual, boolean strNotEqual, int complexExpression) {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("min = " + min);
        System.out.println("result = " + result);
        System.out.println("bitOr = " + bitOr);
        System.out.println("bitXor = " + bitXor);
        System.out.println("bitAnd = " + bitAnd);
        System.out.println("isEqual = " + isEqual);
        System.out.println("isNotEqual = " + isNotEqual);
        System.out.println("isGreater = " + isGreater);
        System.out.println("isLessEqual = " + isLessEqual);
        System.out.println("rightShift = " + rightShift);
        System.out.println("unsignedRightShift = " + unsignedRightShift);
        System.out.println("leftShift = " + leftShift);
        System.out.println("sum = " + sum);
        System.out.println("diff = " + diff);
        System.out.println("product = " + product);
        System.out.println("quotient = " + quotient);
        System.out.println("remainder = " + remainder);
        System.out.println("preIncrement = " + preIncrement);
        System.out.println("postIncrement = " + postIncrement);
        System.out.println("preDecrement = " + preDecrement);
        System.out.println("postDecrement = " + postDecrement);
        System.out.println("concatenation = " + concatenation);
        System.out.println("strEqual = " + strEqual);
        System.out.println("strNotEqual = " + strNotEqual);
        System.out.println("complexExpression = " + complexExpression);
    }
}
