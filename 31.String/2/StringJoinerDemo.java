import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        // Создание StringJoiner с разделителем ", "
        StringJoiner joiner = new StringJoiner(", ");
        joiner.add("Apple").add("Banana").add("Orange");
        
        System.out.println("StringJoiner: " + joiner.toString());  // Apple, Banana, Orange

        // Создание StringJoiner с разделителем и обрамляющими скобками
        StringJoiner joinerWithBrackets = new StringJoiner(", ", "[", "]");
        joinerWithBrackets.add("Red").add("Green").add("Blue");
        
        System.out.println("StringJoiner с скобками: " + joinerWithBrackets.toString());  // [Red, Green, Blue]
    }
}
