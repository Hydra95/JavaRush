package Java_Syntax.task.task02;

/*
Расставить правильно (по другому) скобки, чтобы на экран вывелось число 382

Требования:
Программа не должна считывать данные с клавиатуры.
Метод main должен содержать только один вызов System.out.println.
Последовательность цифр и арифметических операций изменять нельзя.
Количество круглых скобок должно остаться прежним (2 открывающие и 2 закрывающие).
Метод main должен выводить на экран число 382.
 */

public class task0306 {
    public static void main(String[] args) {
       System.out.println(2 * (3 + 4 * (5 + 6 * 7)));
       //System.out.println((2 * 3) + 4 * 5 + (6 * 7));
    }
}
