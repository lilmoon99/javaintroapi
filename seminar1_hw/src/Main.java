import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Answer {
    public int countNTriangle(int n) {
        /*
        Вычислить n-ое треугольного число(сумма чисел от 1 до n).
        Внутри класса Answer напишите метод countNTriangle,
        который принимает число n и возвращает его n-ое треугольное число.
         */
        return n * (n + 1) / 2;
    }

    public void printPrimeNums() {
        /*
        Напишите функцию printPrimeNums, которая выведет на экран все простые числа
        в промежутке от 1 до 1000, каждое на новой строке.
        Напишите свой код в методе printPrimeNums класса Answer.
         */
        int max_length = 1000;
        for (int i = 1; i < max_length; i++) {
            int div_count = 0;
            for (int j = 1; j < max_length; j++) {
                if (i % j == 0) {
                    div_count++;
                }
            }
            if (div_count < 3) {
                System.out.println(i);
            }
        }
    }
}

class Calculator {
    public int calculate(char op, int a, int b) {
        int result = 0;
        if (op == '+') {
            result = a + b;

        } else if (op == '-') {
            result = a - b;
        } else if (op == '/') {
            result = a / b;
        } else if (op == '*') {
            result = a * b;
        } else System.out.printf("Некорректный оператор:%s ", op);


        // Введите свое решение ниже
        return result;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Main {
    public static void main(String[] args) {
        int n = 16;

//        if (args.length == 0) {
//            // При отправке кода на Выполнение, вы можете варьировать эти параметры
//            n = 4;
//        }
//        else{
//            n = Integer.parseInt(args[0]);
//        }

        // Вывод результата на экран
        Answer ans = new Answer();
//        int itresume_res = ans.countNTriangle(n); // задание 1
//        System.out.println(itresume_res);

//        ans.printPrimeNums(); // задание 2

//        char op = '*'; // задание 3
//        int a = 5;
//        int b = 3;
//        Calculator calculator = new Calculator();
//        int result = calculator.calculate(op, a, b);
//        System.out.println(result);

    }
}