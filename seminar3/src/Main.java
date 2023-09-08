import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Map<String,Integer> map = new HashMap<>();
//        map.put("Ivan",1);
//        System.out.println(map.toString());
//        System.out.println(map.get("Ivan"));
//        String s1 = "hello";
//        String s2 = "hello";
//        String s3 = s1;
//        String s4 = "h" + "e" + "l" + "l" + "o";
//        String s5 = new String("hello");
//        String s6 = new String(new char[]{'h','e','l','l','o'});
//
//        System.out.println(s1 == s2);
//        System.out.println(s1 == s3);
//        System.out.println(s1 == s4);
//        System.out.println(s1.equals(s5));
//        System.out.println(s1.equals(s6));

        /*
        Заполнить список десятью случайными числами.
        Отсортировать список методом sort() и вывести
        его на экран.
         */
//        System.out.println(randomNumbers(10).toString());
//        System.out.println(solarSystem(10));
//        System.out.println(deleteInts());
        list2d();

    }

    public static ArrayList<Integer> randomNumbers(int N) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            arrayList.add(random.nextInt(1, 100));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static ArrayList<String> solarSystem(int N) {
        ArrayList<String> tempArrayList = new ArrayList<>();
        Random random = new Random();
        String[] planets = {"Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Uranus"};
        for (int i = 0; i < N; i++) {
            tempArrayList.add(planets[random.nextInt(0, planets.length)]);
        }
        Map<String, Integer> repeats = new HashMap<>();
        for (int i = 0; i < planets.length; i++) {
            repeats.put(planets[i], 0);
        }
        for (int i = 0; i < repeats.size(); i++) {
            for (int j = 0; j < tempArrayList.size(); j++) {
                if (repeats.get(i).equals(tempArrayList.get(j))) {
                    repeats.computeIfPresent(tempArrayList.get(j), (k, v) -> v + 1);
                }
            }
        }
        return tempArrayList;
    }

    public static ArrayList deleteInts() {
        ArrayList<Object> ls = new ArrayList<>();
        ls.add(6);
        ls.add("tetx");
        ls.add("8");
        ls.add(3);
        ls.add(true);
        ls.add(100);
        for (int i = 0; i < ls.size(); i++) {
            if (ls.get(i) instanceof Integer) {
                ls.remove(i);
            }
        }
        return ls;
    }

    public static void list2d(){
        /*
        Каталог товаров книжного магазина сохранен в виде
        двумерного списка List<ArrayList<String>> так, что на 0й
        позиции каждого внутреннего списка содержится название
        жанра, а на остальных позициях - названия книг. Напишите
        метод для заполнения данной структуры.
         */
        List<ArrayList<String >> library = new ArrayList<>();
        ArrayList<String> aL1 = new ArrayList<>(List.of("Проза"));
        aL1.add("Война и мир");
        aL1.add("12 Стульев");
        ArrayList<String> aL2 = new ArrayList<>(List.of("Поэзия"));
        aL2.add("Бородино");
        ArrayList<String> aL3 = new ArrayList<>(List.of("Документальные"));
        library.add(aL1);
        library.add(aL2);
        library.add(aL3);
        for (ArrayList<String> strings : library) {
            System.out.println(strings);
        }

        int rows = library.size();
        for (ArrayList<String> strings : library) {
            int columns = strings.size();
            for (int j = 0; j < columns; j++) {
                System.out.print(strings.get(j) + "\n");
            }

        }
    }
}