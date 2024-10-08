public class InfiniteLoops {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Бесконечный цикл while");
        }

        do {
            System.out.println("Бесконечный цикл do-while");
        } while (true);
    }
}