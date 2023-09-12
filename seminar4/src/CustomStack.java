import java.util.Arrays;

public class CustomStack {
    /*
        Реализовать стэк с помощью массива.
        Нужно реализовать методы:
        size(), empty(), push(), peek(), pop().
     */
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        System.out.println(size(array));
        System.out.println(empty(array));
        System.out.println(Arrays.toString(push(array, 8)));
        System.out.println(peek(array));
        System.out.println(Arrays.toString(pop(array)));

    }
    public static int size(int[] arr){
        return arr.length;
    }
    public static boolean empty(int[] arr){
//        boolean empty() the method checks if the stack is empty or not. Returns true if stack is empty, false if not.
        boolean isEmpty = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr.length > 1){
                return isEmpty;
            }else isEmpty = true;
        }
        return isEmpty;
    }
    public static int[] push(int[] arr,int insert){

//        Object push(Object element) the method adds the specified element to the top of the stack.
        int[] tempArray = new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            tempArray[i] = arr[i];
        }
        tempArray[tempArray.length - 1] = insert;
        return tempArray;
    }
    public static int peek(int[] arr){
//        Object peek() the method returns the element that is at the top of the stack.
        return arr[arr.length - 1];
    }
    public static int[] pop(int[] arr) {
//        Object pop() the method returns the element that is at the top of the stack and removes it.
        int[] tempArray = new int[arr.length-1];
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = arr[i];
        }
        return tempArray;
    }
}
