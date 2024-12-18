
## Практика #1: Как использовать ключевые слова `this` и `super` в подклассах?

- **`this`**:
  - Внутри подкласса `this` используется для ссылки на текущий объект подкласса.
  - Используется для обращения к полям и методам текущего объекта.
  - Также может использоваться для вызова конструктора текущего класса.

- **`super`**:
  - Внутри подкласса `super` используется для ссылки на объект суперкласса.
  - Используется для вызова методов и конструктора суперкласса.
  - Позволяет получить доступ к полям суперкласса (которые имеют уровень доступа `protected` или `public`).

### Пример:
```java
class Parent {
    void method() {
        System.out.println("Метод суперкласса");
    }
}

class Child extends Parent {
    void method() {
        super.method(); // Вызов метода суперкласса
        System.out.println("Метод подкласса");
    }
}
```

## Практика #2: Как спецификаторы `private`, `protected`, `public` и пакетный уровень меняются при наследовании?

### Спецификаторы доступа:
1. **`private`**:
   - Поля и методы с `private` не доступны в подклассе и даже в самом классе.
   - Они остаются только в пределах своего класса.

2. **`protected`**:
   - Поля и методы с `protected` доступны в подклассе и другим классам, находящимся в том же пакете.

3. **`public`**:
   - Поля и методы с `public` доступны из любого класса, включая подклассы и классы в других пакетах.

4. **Пакетный уровень (по умолчанию)**:
   - Если не указан модификатор доступа, то поля и методы доступны только в пределах того же пакета.

### Пример:
```java
class A {
  int a1;             // пакетный уровень, доступен в том же пакете
  public int a2;      // доступен в любом месте
  protected int a3;   // доступен в подклассах и в том же пакете
  private int a4;     // доступен только в классе A

  void method1() {
    // доступно в классе A
  }

  public void method2() {
    // доступно в любом месте
  }

  protected void method3() {
    // доступно в подклассах и в том же пакете
  }
  
  private void method4() {
    // доступно только в классе A
  }
}

class B extends A {
  void methodInB() {
    // a1, a2, a3 доступны
    // a4 недоступен
  }
}

class C extends B {
  void methodInC() {
    // a1, a2, a3 доступны
    // a4 недоступен
  }
}
```
