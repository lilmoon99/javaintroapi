import java.util.ArrayDeque;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        task2();
        task3();
    }

    private static void task3() {
        int a, b, c, d;
        char op, op2, undo;
        a = 3;
        op = '+';
        b = 7;
        c = 4;
        op2 = '+';
        d = 7;
        undo = '<';
        Calculator calculator = new Calculator();
        int result = calculator.calculate(op, a, b);
        System.out.println(result);
        int result2 = calculator.calculate(op2, c, d);
        System.out.println(result2);
        int prevResult = calculator.calculate(undo, 0, 0);
        System.out.println(prevResult);
    }

    private static void task2() {
        MyQueue<Integer> queue;
        queue = new MyQueue<>();
        queue.enqueue(1);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(5);
        System.out.println(queue.getElements());
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getElements());
        System.out.println(queue.first());
    }
}

class MyQueue<T> {
    // Напишите свое решение ниже
    LinkedList<T> queue = new LinkedList<>();

    public void enqueue(T element) {
        //enqueue() - помещает элемент в конец очереди
        queue.addLast(element);
    }

    public T dequeue() {
        // dequeue() - возвращает первый элемент из очереди и удаляет его
        return queue.pollFirst();
    }

    public T first() {
        // Напишите свое решение ниже
        return queue.getFirst();
    }

    public LinkedList<T> getElements() {
        // Напишите свое решение ниже
        return queue;
    }
}

class Calculator {
    ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
    int temp;

    public int calculate(char op, int a, int b) {
        // Напишите свое решение ниже
        switch (op) {
            case '+':
                temp = a + b;
                arrayDeque.add(temp);
                break;
            case '-':
                temp = a - b;
                arrayDeque.add(temp);
                break;
            case '*':
                temp = a * b;
                arrayDeque.add(temp);
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Division by zero.Enter another divider.");
                } else {
                    temp = a / b;
                    arrayDeque.add(temp);
                }
                break;
            case '<':
                arrayDeque.pollLast();
                temp = arrayDeque.pollLast();
                break;
        }

        return temp;
    }
}