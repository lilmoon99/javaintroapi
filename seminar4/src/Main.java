import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        1. Принимает от пользователя строку вида
        text~num
        1. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
        2. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
         */

        Scanner scanner = new Scanner(System.in);
        List<LinkedList<String>> linkedLists = new ArrayList<>();
        while (true) {
            System.out.println("Enter your text~num: ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            String[] parts = input.split("~");
            if (parts.length != 2) {
                System.out.println("Wrong format!");
                continue;
            }
            String action = parts[0];
            int num = Integer.parseInt(parts[1]);
            if (action.equals("text")) {
//                String text = scanner.nextLine();
                addToLinkedList(linkedLists,num,action);
            }else if (action.equals("print")){
                printAndRemove(linkedLists,num);
            }
            else {
                System.out.println("wrong option");
            }
        }
    }

    public static void addToLinkedList(List<LinkedList<String>> linkedLists, int num, String text) {
        while (linkedLists.size() <= num) {
            linkedLists.add(new LinkedList<>());
            if (linkedLists.size() == num){
                linkedLists.add(new LinkedList<>(List.of(text)));
            }
        }
    }

    public static void printAndRemove(List<LinkedList<String>> linkedLists, int num) {
        if (num >= 0&& num< linkedLists.size()&&!linkedLists.get(num).isEmpty()){
            String text = linkedLists.get(num).removeFirst();
            System.out.printf("deleted from %d %s",num,text);
        }else{
            System.out.println("it's empty");
        }
    }
}