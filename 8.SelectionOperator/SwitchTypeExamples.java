public class SwitchTypeExamples {
    public static void main(String[] args) {
        int intValue = 2;
        switch (intValue) {
            case 1:
                System.out.println("int: 1");
                break;
            case 2:
                System.out.println("int: 2");
                break;
            default:
                System.out.println("int: default");
                break;
        }

        char charValue = 'b';
        switch (charValue) {
            case 'a':
                System.out.println("char: a");
                break;
            case 'b':
                System.out.println("char: b");
                break;
            default:
                System.out.println("char: default");
                break;
        }

        String stringValue = "hello";
        switch (stringValue) {
            case "hi":
                System.out.println("String: hi");
                break;
            case "hello":
                System.out.println("String: hello");
                break;
            default:
                System.out.println("String: default");
                break;
        }

        Day day = Day.MONDAY;
        switch (day) {
            case MONDAY:
                System.out.println("Enum: MONDAY");
                break;
            case FRIDAY:
                System.out.println("Enum: FRIDAY");
                break;
            default:
                System.out.println("Enum: default");
                break;
        }
    }

    enum Day {
        MONDAY, FRIDAY, SUNDAY
    }
}
