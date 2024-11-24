interface MyInterface {
    default void printMessage() {
        System.out.println("Это метод по умолчанию!");
    }
    
    static void staticMethod() {
        System.out.println("Это статический метод в интерфейсе.");
    }
}

class MyClass implements MyInterface {
    @Override
    public void printMessage() {
        System.out.println("Переопределенный метод printMessage.");
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.printMessage(); 

        MyInterface.staticMethod();  
    }
}

// Объяснение:

//     default метод: Метод printMessage в интерфейсе имеет реализацию по умолчанию. Класс MyClass может переопределить этот метод, если требуется.
//     static метод: Метод staticMethod в интерфейсе является статическим и вызывается через имя интерфейса, а не через объект.