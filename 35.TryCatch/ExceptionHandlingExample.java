public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            // Генерация первого исключения - перехваченное
            int result = 10 / 0;  // Деление на ноль, вызовет ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль перехвачено!");
        }
        
        // Генерация второго исключения - не перехваченное, программа завершится аварийно
        String str = null;
        System.out.println(str.length());  // Попытка работы с null, вызовет NullPointerException
    }
}
