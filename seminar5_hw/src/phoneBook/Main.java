package phoneBook;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Contact c1 = new Contact("Aynur","89911944602");
        Contact c2 = new Contact("Aynur","89021895717");
        Contact c3 = new Contact("Elisa","89376457588");
        Contact c4 = new Contact("Bro","911");
        Contact c5 = new Contact("Bro","921");
        Contact c6 = new Contact("Bro","931");
        Contact c7 = new Contact("Bro","941");
        Contact c8 = new Contact("Bro1","951");
        Contact c9 = new Contact("Bro1","961");
        Contact c10 = new Contact("Bro1","971");
        Contact c11 = new Contact("Bro1","981");
        Contact c12 = new Contact("Bro1","991");
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(c1);
        phoneBook.add(c2);
        phoneBook.add(c3);
        phoneBook.add(c4);
        phoneBook.add(c5);
        phoneBook.add(c6);
        phoneBook.add(c7);
        phoneBook.add(c8);
        phoneBook.add(c9);
        phoneBook.add(c10);
        phoneBook.add(c11);
        phoneBook.add(c12);
//        System.out.println(c1);
//        phoneBook.printBook();
        sortByValues(phoneBook.getBook());
        phoneBook.printBook();

    }
    public static <K,V> Map<K,V> sortByValues(Map<K, V> map){
        Comparator<K> comparator = new CustomComparator(map);
        Map<K,V> sortedMap = new TreeMap<>(comparator);
        sortedMap.putAll(map);
        return sortedMap;
    }
    static class CustomComparator<K,V extends Comparable> implements Comparator<K>{
        private Map<K,V> map;

        public CustomComparator(Map<K,V> map){
            this.map = new HashMap<>(map);
        }

        @Override
        public int compare(K s1,K s2){
            ArrayList<String> arrayList1 = (ArrayList<String>) map.get(s1);
            ArrayList<String> arrayList2 = (ArrayList<String>) map.get(s2);
            return arrayList1.size() - arrayList2.size();
        }
    }


}
