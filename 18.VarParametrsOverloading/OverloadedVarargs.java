public class OverloadedVarargs {

    public static void printValues(int... numbers) {
        System.out.println("Printing integers:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }

    public static void printValues(String... strings) {
        System.out.println("Printing strings:");
        for (String str : strings) {
            System.out.println(str);
        }
    }

    public static void printValues(Object... objects) {
        System.out.println("Printing objects:");
        for (Object obj : objects) {
            System.out.println(obj.toString());
        }
    }

    public static void main(String[] args) {
        printValues(new int[]{1, 2, 3, 4, 5});

        printValues("Hello", "World", "Java");

        printValues(10, "Text", 3.14, new OverloadedVarargs());
    }

    @Override
    public String toString() {
        return "Instance of OverloadedVarargs";
    }
}
