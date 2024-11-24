public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        
        // Доступ к публичному внутреннему классу
        OuterClass.PublicInner publicInner = outer.new PublicInner();
        publicInner.display();  // Public inner class
        
        // Попытка доступа к защищённому внутреннему классу (ошибка компиляции, если используется из другого пакета)
        // OuterClass.ProtectedInner protectedInner = outer.new ProtectedInner();

        // Попытка доступа к приватному внутреннему классу (ошибка компиляции)
        // OuterClass.PrivateInner privateInner = outer.new PrivateInner();
    }
}
// Объяснение:

//     Public: Внутренний класс доступен из других классов и пакетов.
//     Protected: Внутренний класс доступен в подклассах и в том же пакете.
//     Private: Внутренний класс доступен только внутри внешнего класса.
//     Default (package-private): Внутренний класс доступен только внутри того же пакета.