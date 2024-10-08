public class ArrayAssignment {
    public static void main(String[] args) {
        int a1[] = {1, 2, 3, 4, 5};
        int a2[] = {6, 7, 8, 9, 10};
        a1 = a2; // Теперь переменная a1 указывает на тот же массив, что и a2

        for (int elem : a1) {
            System.out.print(elem + " "); // выведет: 6 7 8 9 10
        }
    }
}

// Объяснение:
// После присваивания a1 = a2, переменная a1 
// начинает ссылаться на тот же массив, что и a2. 
// Таким образом, при обращении к a1, будут использоваться
//  элементы массива, на который указывает a2.