
1. **@Override**

Аннотация `@Override` используется для явного указания того, что метод переопределяет метод родительского класса. Она помогает избежать ошибок, например, если название метода или параметры не совпадают с методом в суперклассе.

**Пример**:
```java
class Animal {
    public void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}
```
В этом примере, если бы метод в классе `Dog` не соответствовал методу в `Animal`, компилятор выдал бы ошибку благодаря аннотации `@Override`.

2. **@Deprecated**

Аннотация `@Deprecated` указывает, что метод или класс устарели и не рекомендуется к использованию. Это предупреждает разработчиков о том, что использование этой функциональности может быть удалено в будущем.

**Пример**:
```java
class MyClass {
    @Deprecated
    public void oldMethod() {
        System.out.println("This method is deprecated");
    }

    public void newMethod() {
        System.out.println("This is the new method");
    }
}
```
Когда `oldMethod()` будет вызван, компилятор выдаст предупреждение, что этот метод устарел.

3. **@SuppressWarnings**

Аннотация `@SuppressWarnings` используется для подавления предупреждений компилятора, таких как предупреждения о непроверяемых операциях (например, работа с коллекциями без указания типа).

**Пример**:
```java
@SuppressWarnings("unchecked")
public void myMethod() {
    List list = new ArrayList();
    list.add("Hello");
    list.add("World");
}
```
В данном примере компилятор может выдать предупреждение о небезопасных операциях с коллекцией, но с аннотацией `@SuppressWarnings("unchecked")` оно будет подавлено.

