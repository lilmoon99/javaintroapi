import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        Map<Integer, String> map = new HashMap<>();
        /*
        📔 Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
        123456 Иванов
        321456 Васильев
        234561 Петрова
        234432 Иванов
        654321 Петрова
        345678 Иванов
Вывести данные по сотрудникам с фамилией Иванов.
         */
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(123456, "Иванов");
        hashMap.put(321456, "Васильев");
        hashMap.put(234561, "Петрова");
        hashMap.put(234432, "Иванов");
        hashMap.put(654321, "Петрова");
        hashMap.put(345678, "Иванов");
        System.out.println(hashMap);
        for (var item : hashMap.entrySet()) {
            if (item.getValue().equals("Иванов")) {
                System.out.println(item);
            }
        }
    }

    public static void task2(){

    }
}