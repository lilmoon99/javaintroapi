import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;

public class task4 {
    public static void main(String[] args) {
        /*
            Взять набор строк, например,Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись.
            Написать метод, который отсортирует эти строки по длине с помощью TreeMap.
            Строки с одинаковой длиной не должны “потеряться”.
         */
        String line = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись.";
        counterByLength(line);
    }
    public static void counterByLength(String line){
        TreeMap<Integer, ArrayList<String>> treeMap = new TreeMap<>();
        line = line.replace("\"","").replace(".","").toLowerCase();
        String[] array = line.split(" ");
//        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));
//        int maxLength = array[0].length();
//        for (int i = 1; i < array.length-1; i++) {
//            if (array[i].length() > maxLength){
//                maxLength = array[i].length();
//            }
//        }
        for (int i = 0; i < array.length; i++) {
            int length = array[i].length();
            if (treeMap.containsKey(length)){
                var temp = treeMap.get(length);
                temp.add(array[i]);
                treeMap.put(length,temp);
            }else {
                treeMap.put(length,new ArrayList<>(Collections.singletonList(array[i])));
            }

        }

        System.out.println(treeMap);
        System.out.println(treeMap.descendingMap());

    }

}
