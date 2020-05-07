package Java_Syntax.task.task03;

/*
Ввести с клавиатуры три имени, вывести на экран надпись:
name1 + name2 + name3 = Чистая любовь, да-да!

Пример:
Вася + Ева + Анжелика = Чистая любовь, да-да!

Требования:
Программа должна выводить текст.
Программа должна считывать данные с клавиатуры.
Выведенный текст должен содержать введенное имя name1.
Выведенный текст должен содержать введенное имя name2.
Выведенный текст должен содержать введенное имя name3.
Выведенный тест должен полностью соответствовать заданию.
 */

import java.io.*;
public class task0322 {
    public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

    String name1 = br.readLine();
    String name2 = br.readLine();
    String name3 = br.readLine();

    System.out.println(name1+" + "+name2+" + "+name3+" = Чистая любовь, да-да!");
    }
}