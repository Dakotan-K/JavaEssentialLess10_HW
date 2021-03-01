package addTask;

public class MyClass <T> {

    public static <T> void factoryMethod(T a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
        factoryMethod(("Hello World!"));
    }
}
