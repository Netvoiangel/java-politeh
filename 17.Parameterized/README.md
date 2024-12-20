
### Объяснение программы:

#### Практика #1: Использование `instanceof` с параметризованными объектами

Метод `printType` использует `instanceof` для проверки типа объекта, хранящегося в параметризованном классе. 

Пример вывода:

```
Item is of type Integer
Item is of type String
Item is of an unknown type
```

#### Практика #2: Использование `<? extends T>` и `<? super T>`

1. **`<? extends T>`:**
   - Позволяет работать со списками или коллекциями объектов, которые являются подтипами указанного типа `T`.
   - Подходит для операций **чтения**, но **запись невозможна**.
   - Пример: `Demo.printNumbers` позволяет передавать списки, содержащие `Integer`, `Double`, и другие подтипы `Number`.

2. **`<? super T>`:**
   - Позволяет работать с коллекциями объектов, которые являются суперклассами указанного типа `T`.
   - Подходит для операций **записи**, так как можно добавлять объекты типа `T` или его подтипов.
   - Пример: `Demo.addIntegers` добавляет `Integer` в список, но список должен быть типа `List<? super Integer>`.

Пример вывода:

```
Printing numbers:
Number: 10
Number: 20
Number: 1.1
Number: 2.2
List after adding integers: [100, 200]
```

