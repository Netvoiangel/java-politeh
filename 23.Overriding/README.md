## Практика #1: Пример перегруженных методов

Перегрузка методов происходит, когда несколько методов с одинаковым названием, но различными параметрами (типами или количеством), присутствуют в одном классе.

### Пример:

```java
class Calculator {
    
    // Перегруженные методы
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println("Сумма целых чисел: " + calc.add(5, 10));        // Вызов метода для int
        System.out.println("Сумма чисел с плавающей точкой: " + calc.add(5.5, 10.5)); // Вызов метода для double
        System.out.println("Сумма строк: " + calc.add("Hello ", "World"));  // Вызов метода для String
    }
}
```

**Вывод:**
```
Сумма целых чисел: 15
Сумма чисел с плавающей точкой: 16.0
Сумма строк: Hello World
```

**Объяснение:**
- Методы с одинаковым названием `add`, но разными параметрами (типами) перегружены в одном классе `Calculator`.
- Метод `add` для целых чисел, чисел с плавающей точкой и строк выполняет соответствующие операции.

---

## Практика #2: Пример переопределенного метода

Переопределение метода происходит, когда метод в подклассе имеет такую же сигнатуру, как и метод в суперклассе. Подкласс может изменить поведение метода, унаследованного от суперкласса.

### Пример:

```java
class Animal {
    // Метод в суперклассе
    public void sound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    // Переопределение метода в подклассе
    @Override
    public void sound() {
        System.out.println("Bark");
    }
}

class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();

        myAnimal.sound();  // Вызовет метод sound() из Animal
        myDog.sound();     // Вызовет переопределенный метод sound() из Dog
    }
}
```

**Вывод:**
```
Some generic animal sound
Bark
```

**Объяснение:**
- Метод `sound` переопределен в классе `Dog`, хотя он был определен в классе `Animal`.
- При вызове метода `sound()` для объекта типа `Animal` будет вызван метод суперкласса, а для объекта типа `Dog` — переопределенный метод.

**Что будет, если у переопределенного и переопределяемого методов не будет совпадать тип возвращаемого значения?**

Если тип возвращаемого значения не совпадает между переопределяющим и переопределяемым методами, то компилятор выдаст ошибку. Важно, чтобы возвращаемые типы были совместимы. Например:

```java
class Animal {
    public int getAge() {
        return 5;
    }
}

class Dog extends Animal {
    // Ошибка компиляции: тип возвращаемого значения не совпадает
    @Override
    public String getAge() {
        return "5 years";
    }
}
```

**Ошибка**: Переопределенный метод должен возвращать совместимый тип, иначе это вызовет ошибку компиляции.

---

## Практика #3: Пример использования аннотации `@Override`

Аннотация `@Override` помогает обнаружить ошибки, такие как неправильное переопределение метода или несоответствие сигнатуры.

### Пример:

```java
class Animal {
    public void sound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    // Ошибка компиляции: неправильно указана сигнатура метода
    @Override
    public void sounds() {  // Неправильное название метода
        System.out.println("Bark");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound(); // Ошибка компиляции: метод sounds() не существует в суперклассе
    }
}
```

**Ошибка компиляции:**
```
error: method does not override or implement a method from a supertype
    @Override
    public void sounds() {
```

**Объяснение:**
- При использовании аннотации `@Override` компилятор проверяет, действительно ли метод в подклассе переопределяет метод из суперкласса.
- Если метод не соответствует сигнатуре метода из суперкласса (например, отличается название или параметры), компилятор выдаст ошибку.
