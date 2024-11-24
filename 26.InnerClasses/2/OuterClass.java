public class OuterClass {
    private String outerField = "Outer field";

    public void outerMethod() {
        System.out.println("Outer method");
    }

    public class InnerClass {
        public void accessOuter() {
            System.out.println("Accessing outer class field: " + outerField);  // Доступ к полю внешнего класса
            outerMethod();  // Доступ к методу внешнего класса
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        InnerClass inner = outer.new InnerClass();
        inner.accessOuter();  // Accessing outer class field: Outer field
                              // Outer method
    }
}
// Объяснение:

//     Внутренний класс имеет доступ ко всем полям и методам внешнего класса, даже если они имеют ограниченные спецификаторы доступа, такие как private.
//     Внутренний класс фактически содержит скрытую ссылку на объект внешнего класса (через this).