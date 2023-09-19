package simplePhoneBook;

public class Main {
    public static void main(String[] args) {
/*
    Реализуйте структуру телефонной книги с помощью HashMap.
    Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами,
    их необходимо считать, как одного человека с разными телефонами.
    Вывод должен быть отсортирован по убыванию числа телефонов.
 */
        Phonebook phonebook = new Phonebook();
        phonebook.add("Айнур","89911944602");
//        System.out.println(phonebook);
        phonebook.add("Айнур","89021895717");
        phonebook.add("Елизавета","89376457588");
        phonebook.printBook();
        System.out.println(phonebook);
    }
}