### Практика #1: Объяснение целей основных классов исключений

- **Throwable** — это корневой класс для всех исключений и ошибок в Java. Он делится на два основных подтипа:
  - **Error** — ошибки, которые обычно означают проблемы с JVM или системными ресурсами (например, `OutOfMemoryError`, `StackOverflowError`). Эти ошибки обычно не обрабатываются в коде.
  - **Exception** — исключения, которые могут возникнуть в программе, и с которыми можно работать. Это основная категория для всех ошибок, с которыми программа должна справляться.
    - **RuntimeException** — исключения, которые возникают во время выполнения программы и обычно не проверяются компилятором (например, `NullPointerException`, `ArrayIndexOutOfBoundsException`). Эти исключения часто являются следствием ошибок программиста.
    - **Проверяемые исключения** (checked exceptions) — исключения, которые нужно явно обрабатывать, например, `IOException`, `SQLException`.

### Практика #2: Примеры генерации и обработки исключений

1. **ArithmeticException** — исключение при делении на ноль.

```java
public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;  // Деление на ноль
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль!");
        }
    }
}
```

2. **ArrayIndexOutOfBoundsException** — исключение при выходе за пределы массива.

```java
public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        try {
            int value = array[5];  // Индекс выходит за пределы массива
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: выход за пределы массива!");
        }
    }
}
```

3. **IllegalArgumentException** — исключение при передаче неверного аргумента методу.

```java
public class IllegalArgumentExceptionExample {
    public static void main(String[] args) {
        try {
            setAge(-1);  // Неверный возраст
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: неверный аргумент!");
        }
    }

    public static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
    }
}
```

4. **ClassCastException** — исключение при некорректном приведении типов.

```java
public class ClassCastExceptionExample {
    public static void main(String[] args) {
        Object obj = new Integer(10);
        try {
            String str = (String) obj;  // Невозможно привести Integer к String
        } catch (ClassCastException e) {
            System.out.println("Ошибка: некорректное приведение типов!");
        }
    }
}
```

5. **NullPointerException** — исключение при работе с null-объектом.

```java
public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String str = null;
        try {
            int length = str.length();  // Попытка вызова метода на null
        } catch (NullPointerException e) {
            System.out.println("Ошибка: обращение к null!");
        }
    }
}
```

### Объяснение:

- **ArithmeticException**: Генерируется, когда происходит ошибка в арифметической операции, например, деление на ноль.
- **ArrayIndexOutOfBoundsException**: Возникает, когда индекс выходит за пределы массива.
- **IllegalArgumentException**: Возникает, когда метод получает неправильный или неподобающий аргумент.
- **ClassCastException**: Происходит при попытке привести объект одного типа к несовместимому типу.
- **NullPointerException**: Генерируется, когда пытаются вызвать метод или обратиться к полю объекта, который равен `null`.

Каждое из этих исключений обрабатывается с помощью блока `try-catch`, чтобы программа могла продолжить выполнение или предоставить пользователю информативное сообщение о причине ошибки.