package Java_Syntax.task.task03;

/*
Ввести с клавиатуры отдельно Имя, число1, число2.
Вывести надпись:
"Имя" получает "число1" через "число2" лет.

Пример:
Коля получает 3000 через 5 лет.

Требования:
Программа должна выводить текст.
Программа должна считывать данные с клавиатуры.
Выведенный текст должен содержать введенное имя.
Выведенный текст должен содержать введенное число1.
Выведенный текст должен содержать введенное число2.
Выведенный текст должен полностью соответствовать заданию.
 */
import java.io.*;
public class task0319 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

        String name = br.readLine();
        int value1 = Integer.parseInt(br.readLine());
        int value2 = Integer.parseInt(br.readLine());
        System.out.println(name+" получает "+value1+" через "+value2+" лет.");
    }
}
