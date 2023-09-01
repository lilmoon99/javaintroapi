package org.example;

import org.w3c.dom.css.Counter;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            Scanner inputData = new Scanner(System.in);
//            System.out.println("Enter your age: ");
//            int age = inputData.nextInt();
//            if (age >= 18) System.out.println("Welcome");
//            else if (age >= 15) System.out.println("Sorry, you're not allowed!");
//            else System.out.println("Too small, go to school!");
//        }
        /*
        Написать программу, которая запросит пользователя ввести <Имя> в консоли.
        Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!
         */
//        Scanner inputName = new Scanner(System.in);
//        System.out.print("Enter your name: ");
//        String name = inputName.nextLine();
//        System.out.printf("Hello, %s!", name);


//        int[] array = {1, 1, 0, 0, 1, 1, 1, 1};
//        System.out.println(counter(array));
        var array2 = new int[]{3, 2, 2, 3, 4, 35, 3, 24, 234, 4, 23, 52, 2, 2, 3, 3, 5, 6565, 3, 55, 3};
        System.out.println(Arrays.toString(threeToEnd(array2, 3)));

    }

    private static int counter(int[] array) {
        /*
        Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
         */
        int count_temp = 0;
        int max_count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                count_temp++;
            } else count_temp = 0;
            if (max_count < count_temp) {
                max_count = count_temp;
            }
        }
        return max_count;
    }

    private static int[] threeToEnd(int[] array, int value) {

        /*
        Следующее задание: Дан массив nums = [3,3,2,3] и число val = 3.
        Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
        Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
        а остальные - равны ему.
         */


        boolean swap = true;
        while (swap) {
            swap = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] == value && array[i + 1] != value) {
                    var temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    swap = true;
                }
            }
        }


        return array;
    }
}