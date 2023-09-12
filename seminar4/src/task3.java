import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Stack;

public class task3 {
    public static void main(String[] args) {
        /*
        1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на
        консоль содержимое стэка.
        2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на
        консоль содержимое очереди.
         */

        Integer[] array = new Integer[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1,50);
        }
        insertStack(array);
    }
    public static void insertStack(Object[] arr){
        Stack<Object> stack = new Stack<>();
        Collections.addAll(stack, arr);
        System.out.println(stack);
    }
}
