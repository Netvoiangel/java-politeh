/**
 * @author Timur
 * @version 1.0
 * @since 2024
 */
public class Calculator {

    /**
     * Метод для сложения двух чисел.
     * 
     * @param a первое число
     * @param b второе число
     * @return сумма двух чисел
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Метод для вычитания одного числа из другого.
     * 
     * @param a уменьшаемое число
     * @param b вычитаемое число
     * @return разница двух чисел
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Метод для умножения двух чисел.
     * 
     * @param a первый множитель
     * @param b второй множитель
     * @return произведение двух чисел
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Метод для деления одного числа на другое.
     * 
     * @param a делимое число
     * @param b делитель
     * @return результат деления
     * @throws ArithmeticException если делитель равен нулю
     */
    public double divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль невозможно.");
        }
        return (double) a / b;
    }
}
