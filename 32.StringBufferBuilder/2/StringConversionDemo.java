public class StringConversionDemo {
    public static void main(String[] args) {
        // Создаем объекты String, StringBuffer и StringBuilder
        String str = "Hello, World!";
        StringBuffer sbf = new StringBuffer("Hello, StringBuffer!");
        StringBuilder sbd = new StringBuilder("Hello, StringBuilder!");

        // Преобразование String в StringBuffer
        StringBuffer sbfFromString = new StringBuffer(str);
        System.out.println("String to StringBuffer: " + sbfFromString);  // Hello, World!

        // Преобразование String в StringBuilder
        StringBuilder sbdFromString = new StringBuilder(str);
        System.out.println("String to StringBuilder: " + sbdFromString);  // Hello, World!

        // Преобразование StringBuffer в String
        String strFromStringBuffer = sbf.toString();
        System.out.println("StringBuffer to String: " + strFromStringBuffer);  // Hello, StringBuffer!

        // Преобразование StringBuilder в String
        String strFromStringBuilder = sbd.toString();
        System.out.println("StringBuilder to String: " + strFromStringBuilder);  // Hello, StringBuilder!

        // Преобразование StringBuffer в StringBuilder (можно через String)
        StringBuilder sbdFromStringBuffer = new StringBuilder(sbf.toString());
        System.out.println("StringBuffer to StringBuilder: " + sbdFromStringBuffer);  // Hello, StringBuffer!
    }
}
