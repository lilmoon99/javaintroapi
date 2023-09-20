package phoneBook;

import java.util.*;

public class PhoneBook {
    int count;
    Map<String,ArrayList<String>> book= new HashMap<>();
    public void search(Contact contact){

    }

    public void printBook(){
        book.entrySet().forEach(System.out::println);
    }

    public Map<String, ArrayList<String>> getBook() {
        return book;
    }

    public void add(Contact contact){
    if (book.containsKey(contact.getName())){
        var temp = book.get(contact.getName());
        temp.add(contact.getPhone_number());
        book.put(contact.getName(),temp);
    }else {
        book.put(contact.getName(),new ArrayList<>(Collections.singleton(contact.getPhone_number())));
    }
    }





    @Override
    public String toString() {
        return "PhoneBook{" +
                "book=" + book +
                '}';
    }


}
