class Ex1 extends Exception {}
class Ex2 extends Ex1 {}
class Ex3 extends Ex2 {}

public class ExceptionHierarchyExample {
    public static void main(String[] args) {
        try {
            // Генерация исключения Ex3
            throw new Ex3();
        } catch (Ex3 e) {
            System.out.println("Перехвачено исключение Ex3");
        } catch (Ex2 e) {
            System.out.println("Перехвачено исключение Ex2");
        } catch (Ex1 e) {
            System.out.println("Перехвачено исключение Ex1");
        }
    }
}
