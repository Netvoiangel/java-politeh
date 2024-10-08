public class MethodOverloading {

    public void printInfo(String name) {
        System.out.println("Name: " + name);
    }

    public void printInfo(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public void printInfo(int id) {
        System.out.println("ID: " + id);
    }

    public static void main(String[] args) {
        MethodOverloading example = new MethodOverloading();

        example.printInfo("Alice");
        example.printInfo("Bob", 25);
        example.printInfo(12345);
    }
}
