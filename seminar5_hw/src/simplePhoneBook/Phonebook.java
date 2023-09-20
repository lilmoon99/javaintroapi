package simplePhoneBook;

import java.util.*;

public class Phonebook {
    /*
    Реализуйте структуру телефонной книги с помощью HashMap.
    Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами,
    их необходимо считать, как одного человека с разными телефонами.
    Вывод должен быть отсортирован по убыванию числа телефонов.
     */
    private String name;
    private String phone_number;
    private Map<String, ArrayList<String>> book = new HashMap<>();

    public Phonebook() {
    }

    public Phonebook(String name,String phone_number){
        this.name = name;
        this.phone_number = phone_number;
        add(name,phone_number);
    }


    public void add(String name, String phone_number) {
        if (book.containsKey(name)){
            ArrayList<String> tempArrayList = book.get(name);
            tempArrayList.add(phone_number);
            book.put(name,tempArrayList);
        }else {
            book.put(name,new ArrayList<>(Collections.singleton(phone_number)));
        }

    }

    public void printBook() {
//        System.out.println(book.keySet());
        for (Map.Entry<String, ArrayList<String>> entry: book.entrySet())
        {
            String key = entry.getKey();
            String value = entry.getValue().toString().replace("[","").replace("]","");
            System.out.println("Имя:" + key + "\nНомер телефона: " + value);
        }
    }



    @Override
    public String toString() {
        return "simplePhoneBook.Phonebook{" +
                "book=" + book +
                '}';
    }
}
