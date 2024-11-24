## Практика #1: Невозможность переопределения `final` метода в подклассе

Когда метод объявлен с модификатором `final`, его нельзя переопределить в подклассе.

### Пример:

```java
class Parent {
    public final void method() {
        System.out.println("Метод суперкласса");
    }
}

class Child extends Parent {
    // Ошибка компиляции: метод не может быть переопределен, потому что он final
    @Override
    public void method() {
        System.out.println("Метод подкласса");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.method();  // Выведет: Метод суперкласса
    }
}
```

**Объяснение**:
- Метод `method` в классе `Parent` объявлен как `final`, и попытка переопределить его в классе `Child` вызывает ошибку компиляции.

---

## Практика #2: Невозможность использования наследования для `final` класса

Когда класс объявлен с модификатором `final`, он не может быть использован как суперкласс для других классов.

### Пример:

```java
final class Parent {
    public void method() {
        System.out.println("Метод суперкласса");
    }
}

// Ошибка компиляции: класс не может быть унаследован, потому что он final
class Child extends Parent {
    public void method() {
        System.out.println("Метод подкласса");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.method();  // Выведет: Метод суперкласса
    }
}
```

**Объяснение**:
- Класс `Parent` объявлен как `final`, и попытка создать подкласс `Child`, который наследует от `Parent`, вызывает ошибку компиляции.
- Классы с модификатором `final` не могут быть расширены, что предотвращает их использование в качестве суперклассов.
