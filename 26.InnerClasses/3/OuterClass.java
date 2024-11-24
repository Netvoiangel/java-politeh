public class OuterClass {
    public class InnerClass {
        private String innerField = "Inner field";

        public void innerMethod() {
            System.out.println(innerField);
        }
    }

    public void accessInnerClass() {
        InnerClass inner = new InnerClass();
        inner.innerMethod();  // Доступ к методу внутреннего класса
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.accessInnerClass();  // Inner field
    }
}
// Объяснение:

//     Внешний класс может создавать объект внутреннего класса только через внешний объект (например, outer.new InnerClass()).
//     Внешний класс может получить доступ только к публичным полям и методам внутреннего класса, если они не private.