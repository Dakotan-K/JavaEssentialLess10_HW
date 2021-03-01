package task2;

public class Main {
    public static void main(String[] args) {

        MyList<Integer> list = new MyList<>();
        list.add(50);
        list.add(100);
        list.add(150);
        list.add(200);

        System.out.println("Мой список: " + list.getList());
        System.out.println("Номер индекса числа 50: " + list.index(50));
        System.out.println("Номер индекса числа 200: " + list.index(200));
        System.out.println("Количество элементов в списке: " + list.counter());
    }
}
