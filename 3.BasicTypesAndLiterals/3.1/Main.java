public class Main {
    public static void main(String[] args) {
        // Целочисленные типы
        byte byteValue = 0; // 8 бит, диапазон от -128 до 127
        short shortValue = 0; // 16 бит, диапазон от -32,768 до 32,767
        int intValue = 0; // 32 бит, диапазон от -2^31 до 2^31-1
        long longValue = 0L; // 64 бит, диапазон от -2^63 до 2^63-1
        
        // Типы с плавающей точкой
        float floatValue = 0.0f; // 32 бит, точность до 7 знаков после запятой
        double doubleValue = 0.0; // 64 бит, точность до 15 знаков после запятой
        
        // Символьный тип
        char charValue = '\u0000'; // 16 бит, диапазон от '\u0000' до '\uffff'
        
        // Булевский тип
        boolean booleanValue = false; // Может быть true или false
        
        // Вывод значений на консоль
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("char: '" + charValue + "'");
        System.out.println("boolean: " + booleanValue);
    }
}
