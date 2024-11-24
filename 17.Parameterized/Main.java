import java.util.ArrayList;
import java.util.List;

class Wrapper<T> {
    private T item;

    public Wrapper(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public void printType() {
        if (item instanceof Integer) {
            System.out.println("Item is of type Integer");
        } else if (item instanceof String) {
            System.out.println("Item is of type String");
        } else {
            System.out.println("Item is of an unknown type");
        }
    }
}

class Demo {
    public static void printNumbers(List<? extends Number> numbers) {
        for (Number num : numbers) {
            System.out.println("Number: " + num);
        }
    }

    public static void addIntegers(List<? super Integer> integers) {
        integers.add(100); // Можно добавлять объекты Integer
        integers.add(200); // Можно добавлять только Integer или подтипы
    }
}

public class Main {
    public static void main(String[] args) {
        // Практика #1: Использование instanceof
        Wrapper<Integer> intWrapper = new Wrapper<>(42);
        intWrapper.printType(); // "Item is of type Integer"

        Wrapper<String> stringWrapper = new Wrapper<>("Hello");
        stringWrapper.printType(); // "Item is of type String"

        Wrapper<Double> doubleWrapper = new Wrapper<>(3.14);
        doubleWrapper.printType(); // "Item is of an unknown type"

        // Практика #2: Использование <? extends T>
        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.1);
        doubleList.add(2.2);

        System.out.println("Printing numbers:");
        Demo.printNumbers(intList);
        Demo.printNumbers(doubleList);

        List<Object> objList = new ArrayList<>();
        Demo.addIntegers(objList); 
        System.out.println("List after adding integers: " + objList);

        // Пример нарушения ограничений: нельзя добавлять произвольные числа
        // List<? extends Number> будет работать только для чтения, не для записи
        // Demo.addIntegers(doubleList); // Ошибка компиляции!
    }
}
