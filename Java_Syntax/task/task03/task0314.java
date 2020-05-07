package Java_Syntax.task.task03;

/*
Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 4 ...
2 4 6 8 ...
3 6 9 12 ...
4 8 12 16 ...
...

Требования:
•	Программа должна выводить текст.
•	Выведенный текст должен содержать 10 строк.
•	Каждая выведенная строка должна содержать 10 чисел, разделенных пробелом.
•	Выведенные числа должны быть таблицей умножения.
 */

public class task0314 {
    public static void main(String[] args) {

        for (int i=1; i<11; i++) {
            for (int y=1; y<11; y++) {
                System.out.print(i*y+" ");
            }
            System.out.println ();
        }
    }
}
