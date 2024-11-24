public class StringBufferBuilderDemo {
    public static void main(String[] args) {
        // Создаем объекты StringBuffer и StringBuilder
        StringBuffer sbf = new StringBuffer("Hello");
        StringBuilder sbd = new StringBuilder("World");

        // 1. append() - добавляет строку в конец
        sbf.append(", Java!");
        System.out.println("append(): " + sbf);  // Hello, Java!

        // 2. insert() - вставляет строку в указанную позицию
        sbf.insert(5, ",");
        System.out.println("insert(): " + sbf);  // Hello, Java!

        // 3. delete() - удаляет символы с указанного диапазона
        sbf.delete(5, 7);
        System.out.println("delete(): " + sbf);  // HelloJava!

        // 4. replace() - заменяет символы в указанном диапазоне
        sbf.replace(5, 10, "Java 8");
        System.out.println("replace(): " + sbf);  // HelloJava 8

        // 5. reverse() - переворачивает строку
        sbf.reverse();
        System.out.println("reverse(): " + sbf);  // 8avaJolleH

        // 6. capacity() - возвращает емкость строки
        System.out.println("capacity(): " + sbf.capacity());  // 34

        // 7. ensureCapacity() - гарантирует минимум заданную емкость
        sbf.ensureCapacity(50);
        System.out.println("ensureCapacity(): " + sbf.capacity());  // 50

        // 8. charAt() - возвращает символ по индексу
        System.out.println("charAt(): " + sbf.charAt(0));  // 8

        // 9. substring() - извлекает подстроку
        System.out.println("substring(): " + sbf.substring(2, 6));  // vaJ

        // 10. toString() - преобразует StringBuffer/StringBuilder в String
        String result = sbf.toString();
        System.out.println("toString(): " + result);  // vaJolleH
    }
}
