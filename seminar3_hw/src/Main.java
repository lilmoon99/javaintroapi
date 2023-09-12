import java.text.CollationKey;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Integer[] arr = new Integer[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1, 100);
        }
        System.out.println(Arrays.toString(arr));
//        int[] res = mergeSort(arr);               // Задание 1
//        System.out.println(Arrays.toString(res));
//        removeEvenNumbers(arr);                   //Задание 2
        analyzeNumbers(arr);
    }

    public static int[] mergeSort(int[] sortArr) {
        int[] buffer1 = Arrays.copyOf(sortArr, sortArr.length);
        int[] buffer2 = new int[sortArr.length];
        return mergeSortInner(buffer1, buffer2, 0, sortArr.length);
    }

    public static int[] mergeSortInner(int[] buffer1, int[] buffer2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        //уже отсортирован
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergeSortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergeSortInner(buffer1, buffer2, middle, endIndex);

        //слияние
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }

    public static void removeEvenNumbers(Integer[] arr) {
        ArrayList<Integer> tempArrayList = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                tempArrayList.add(arr[i]);
            }
        }
        System.out.println(tempArrayList.toString());
    }

    public static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    public static void analyzeNumbers(Integer[] arr) {
//        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(arr));
//        Collections.sort(arrayList);
//        System.out.println(arrayList.toString());
//        System.out.printf("Minimum is %d\n",Collections.min(arrayList));
//        System.out.printf("Maximum is %d\n",Collections.max(arrayList));
//        int result = 0;
//        for (int i = 0; i < arrayList.size(); i++) {
//            result = result + arrayList.get(i);
//        }
//        System.out.printf("Average is %d\n",result/arrayList.size());
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(arr));
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                swap(arr, i, i - 1);
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arrayList.toString());
        System.out.printf("Minimum is %d\n", arr[0]);
        System.out.printf("Maximum is %d\n", arr[arr.length - 1]);
        int result = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            result = result + arrayList.get(i);
        }
        System.out.printf("Average is %d\n", result / arrayList.size());
    }

    public static void swap(Integer[] array, int ind1, int ind2) {
        Integer tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}

