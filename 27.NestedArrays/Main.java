interface MyInterface {
    class NestedClass {
        public void display() {
            System.out.println("Вложенный класс в интерфейсе");
        }
    }
}

public class Main implements MyInterface {
    public static void main(String[] args) {
        MyInterface.NestedClass nested = new MyInterface.NestedClass();
        nested.display();  // Вложенный класс в интерфейсе
    }
}
