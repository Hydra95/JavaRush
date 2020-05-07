package Java_Syntax.task.task03;
import java.io.*;

/*
Ввести с клавиатуры число и имя, вывести на экран строку:
"имя" захватит мир через "число" лет. Му-ха-ха!

Пример:
Вася захватит мир через 8 лет. Му-ха-ха!

Последовательность вводимых данных имеет большое значение.

Требования:
Программа должна выводить текст.
Программа должна считывать данные с клавиатуры.
Выведенный текст должен содержать введенное имя.
Выведенный текст должен содержать введенное число.
Выведенный текст должен полностью соответствовать заданию.
 */

public class task0318 {
        public static void main(String[] args) throws Exception {
            InputStreamReader sreader = new InputStreamReader (System.in);
            BufferedReader br = new BufferedReader (sreader);

            int age = Integer.parseInt(br.readLine());
            String name = br.readLine();

            System.out.println (name+" захватит мир через "+age+" лет. Му-ха-ха!");
    }
}
