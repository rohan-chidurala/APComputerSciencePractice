/*
public class Confusing {
    public static void main(String[] args) {
        method1();
        method3();
        method2();
        method3();
    }

    public static void method2() {
        method1();
        System.out.println("I am method 2.");
    }

    public static void method3() {
        method1();
        method2();
        System.out.println("I am method 3.");
    }

    public static void method1() {
        System.out.println("I am method 1.");
    }
}
*/

/*ANSWER:
I am method 1.
I am method 1.
I am method 1.
I am method 2.
I am method 3.
I am method 1.
I am method 2.
I am method 1.
I am method 1.
I am method 2.
I am method 3.
*/