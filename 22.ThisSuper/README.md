
## Практика #1: Пример использования ключевого слова `super`

### Ключевое слово `super` может быть использовано для:
1. **Обращения к конструктору суперкласса**
2. **Доступа к полю суперкласса**
3. **Доступа к методу суперкласса**

### Пример:

```java
class Parent {
    int a = 10;
    
    Parent() {
        System.out.println("Конструктор суперкласса");
    }
    
    void method() {
        System.out.println("Метод суперкласса");
    }
}

class Child extends Parent {
    int a = 20;

    Child() {
        super();  // Вызов конструктора суперкласса
        System.out.println("Конструктор подкласса");
    }

    void method() {
        super.method();  // Вызов метода суперкласса
        System.out.println("Метод подкласса");
    }

    void printValues() {
        System.out.println("Поле суперкласса a = " + super.a);  // Доступ к полю суперкласса
        System.out.println("Поле подкласса a = " + this.a);    // Доступ к полю текущего класса
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();  // Вызовет конструктор суперкласса
        child.method();             // Вызовет метод суперкласса и метод подкласса
        child.printValues();        // Доступ к полям суперкласса и подкласса
    }
}
```

**Вывод:**
```
Конструктор суперкласса
Конструктор подкласса
Метод суперкласса
Метод подкласса
Поле суперкласса a = 10
Поле подкласса a = 20
```

**Объяснение:**
- `super()` вызывает конструктор суперкласса.
- `super.method()` вызывает метод суперкласса.
- `super.a` доступ к полю суперкласса.

---

## Практика #2: Что случится при вызове метода `method()` объекта класса `C`, если переменная `a` и метод `method()` не будут определены в классе `B`, а будут определены только в классе `A`?

### Пример:

```java
class A {
    int a = 10;

    void method() {
        System.out.println("Метод A");
    }
}

class B extends A {
    // Класс B не определяет переменную `a` и метод `method()`
}

class C extends B {
    void method() {
        System.out.println("Метод C");
        int a = super.a;   // Доступ к переменной `a` из класса A через суперкласс B
        super.method();     // Вызов метода `method()` из класса A через суперкласс B
        System.out.println("a из суперкласса A: " + a);
    }
}

public class Main {
    public static void main(String[] args) {
        C c = new C();
        c.method();  // Вызов метода из класса C, который использует суперклассы
    }
}
```

**Вывод:**
```
Метод C
Метод A
a из суперкласса A: 10
```

**Объяснение:**
- Переменная `a` и метод `method()` не определены в классе `B`, но они унаследованы от класса `A`. Ключевое слово `super` позволяет обратиться к ним через суперкласс `B`.

