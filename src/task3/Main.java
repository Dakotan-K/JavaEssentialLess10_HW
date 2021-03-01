package task3;


public class Main {
    public static void main(String[] args) {

        MyDictionary<String, String> dictionary = new MyDictionary<>();

        dictionary.add("Book 1: ", " 560");
        dictionary.add("Book 2: ", " 720");
        dictionary.add("Book 3: ", " 300");
        dictionary.add("Book 4: ", " 1490");

        System.out.println("В библиотеке следующие книги:\n" + dictionary.getDictionary());
        System.out.println("Количество страниц в книге 2: " + dictionary.indexOfMeth("Book 2: "));
        System.out.println("Количество книг в библиотеке: " + dictionary.counter());
    }
}
