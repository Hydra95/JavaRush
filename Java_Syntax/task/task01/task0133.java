package Java_Syntax.task.task01;

/*
Напиши код, который считает сколько секунд прошло с 15:00, если на часах 15:30. Выведи результат на экран.
Требования:
•	Программа должна выводить текст.
•	Выведенный текст должен быть целым положительным числом.
•	Выведенное число должно быть кратно 60.
•	Выводимое число должно соответствовать заданию.
 */

public class task0133 {
    public static void main(String[] args) {
        int a1 = 15 * 60;
        int b2 = a1 + 30;
        int c1 = b2 - a1;
        int y1 = 3600/2;
        System.out.println(y1);
    }
}
