class MyFirstException extends Exception {

    public MyFirstException() {
        super("Произошло собственное исключение");
    }

    public MyFirstException(String message) {
        super(message);
    }

    public MyFirstException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyFirstException(Throwable cause) {
        super(cause);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            throw new MyFirstException("Это мое первое исключение");
        } catch (MyFirstException e) {
            System.out.println("Перехвачено исключение: " + e.getMessage());
        }
        
        try {
            throw new MyFirstException("Ошибка с причиной", new NullPointerException("Причина - NullPointerException"));
        } catch (MyFirstException e) {
            System.out.println("Перехвачено исключение: " + e.getMessage());
            System.out.println("Причина: " + e.getCause());
        }
    }
}
