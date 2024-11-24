### Практика #1: Пример интерфейса с неабстрактным и статическим методом

В Java 8 и выше интерфейсы могут содержать как обычные абстрактные методы, так и неабстрактные методы с использованием ключевого слова `default`. Также интерфейсы могут иметь статические методы.

(Смотрите Main.java)

### Практика #2: Реализация двух интерфейсов с одинаковыми неабстрактными методами

Когда класс реализует два интерфейса с одинаковыми методами, возникает конфликт, если эти методы не имеют одинаковую реализацию в обоих интерфейсах. Для решения этой проблемы, класс должен явно переопределить метод.

Пример:

```java
interface InterfaceA {
    default void display() {
        System.out.println("Метод display из InterfaceA");
    }
}

interface InterfaceB {
    default void display() {
        System.out.println("Метод display из InterfaceB");
    }
}

class MyClass implements InterfaceA, InterfaceB {
    // Переопределяем метод display, чтобы разрешить конфликт
    @Override
    public void display() {
        System.out.println("Переопределенный метод display в MyClass");
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.display();  // Вывод: Переопределенный метод display в MyClass
    }
}
```

**Объяснение**:
1. В данном примере интерфейсы `InterfaceA` и `InterfaceB` оба содержат метод `display` с реализацией по умолчанию.
2. Когда класс `MyClass` реализует оба интерфейса, возникает конфликт, так как оба интерфейса имеют одинаковые методы.
3. Чтобы разрешить этот конфликт, класс `MyClass` переопределяет метод `display`, предоставляя свою собственную реализацию.

Если бы класс `MyClass` не переопределил метод `display`, компилятор выдал бы ошибку, так как невозможно разрешить, какой метод использовать из двух интерфейсов.