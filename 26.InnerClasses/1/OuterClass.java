public class OuterClass {
    
    // Приватный внутренний класс
    private class PrivateInner {
        public void display() {
            System.out.println("Private inner class");
        }
    }

    // Защищённый внутренний класс
    protected class ProtectedInner {
        public void display() {
            System.out.println("Protected inner class");
        }
    }

    // Публичный внутренний класс
    public class PublicInner {
        public void display() {
            System.out.println("Public inner class");
        }
    }

    // Внутренний класс с пакетом по умолчанию (default)
    class DefaultInner {
        public void display() {
            System.out.println("Default inner class");
        }
    }
}
// Объяснение:

//     Public: Внутренний класс доступен из других классов и пакетов.
//     Protected: Внутренний класс доступен в подклассах и в том же пакете.
//     Private: Внутренний класс доступен только внутри внешнего класса.
//     Default (package-private): Внутренний класс доступен только внутри того же пакета.