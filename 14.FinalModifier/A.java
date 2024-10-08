public class A {

    public final int a = 10;

    public final int b;
    
    public final int c;

    {
        c = 30;
    }

    public A(int bValue) {
        this.b = bValue;
    }

    public static void main(String[] args) {
        A obj1 = new A(20);
        System.out.println("a: " + obj1.a); // 10
        System.out.println("b: " + obj1.b); // 20
        System.out.println("c: " + obj1.c); // 30
    }
}
