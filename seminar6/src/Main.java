import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Set<Integer> hashSet = new HashSet<>(List.of(1,2,3,2,4,5,6,3));
//        Set<Integer> treeSet = new TreeSet<>(List.of(1,2,3,2,4,5,6,3));
//        Set<Integer> linkedHashSet = new LinkedHashSet<>(List.of(1,2,3,2,4,5,6,3));
//
//        System.out.println(hashSet);
//        System.out.println(linkedHashSet);
//        System.out.println(treeSet);


        /*
        1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.

        2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите
        процент уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.

        Для вычисления процента используйте формулу:
        процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

         */
//        Random random = new Random();
//        int[] array = new int[1000];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(0,25);
//
//        }
//
//        System.out.println(uniqueNumbersPercent(array));

        CatClinic catClinic = new CatClinic();
        Cat cat1 = new Cat("Murzik",new ArrayList<>(List.of("Anti-angry vaccine")),5,"Turkish",2,new Date(1202324800),"male",true);
        Cat cat2 = new Cat("Barsik",new ArrayList<>(List.of("Anti-angry vaccine")),4,"Russian",6,new Date(1712324800),"female",true);
        Cat cat3 = new Cat("Persia",new ArrayList<>(List.of("Anti-angry vaccine")),2,"Siberian",17,new Date(1705324800),"male",false);
        Cat cat4 = new Cat("Catjiit",new ArrayList<>(List.of("Anti-angry vaccine")),7,"American",1,new Date(1702327800),"female",true);
        catClinic.checkCat(cat1);
        catClinic.checkCat(cat2);
        catClinic.checkCat(cat3);
        catClinic.checkCat(cat4);
//        System.out.println(catClinic.toString());
        catClinic.getClinic().forEach(System.out::println);
    }
    public static float uniqueNumbersPercent(int[] arr){
        Set<int[]> set = new HashSet<>();
        Collections.addAll(set, arr);
        return (float) set.size()*100/arr.length;
    }
}