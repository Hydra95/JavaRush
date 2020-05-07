package Java_Syntax.task.task03;

/*
Ввести с клавиатуры число n.
Вывести на экран надпись "Я буду зарабатывать $n в час".

Пример:
Я буду зарабатывать $50 в час
Требования:
Программа должна выводить текст.
Программа должна считывать данные с клавиатуры.
Выведенный текст должен содержать введенное число n.
Выведенный тест должен полностью соответствовать заданию.
 */

import java.io.*;
public class task0325 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sallary = Integer.parseInt(reader.readLine());
        System.out.println("Я буду зарабатывать $"+sallary+" в час");
    }
}
