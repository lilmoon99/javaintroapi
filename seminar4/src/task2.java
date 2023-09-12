import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        /*
        Реализовать консольное приложение, которое:
        1.Принимает от пользователя и “запоминает” строки.
        2.Если введено print, выводит строки так, чтобы последняя введенная была первой в списке,
        а первая - последней.
        3.Если введено revert, удаляет предыдущую введенную строку из памяти.
         */
        Deque<String> deque = new LinkedList<>();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            deque.add(scanner.nextLine());
            String action = scanner.nextLine();
            if (action.equals("print")) {
                var tempFirst = deque.pollFirst();
                var tempLast = deque.pollFirst();
                deque.addFirst(tempLast);
                deque.addLast(tempFirst);
            }
        }
    }
}
