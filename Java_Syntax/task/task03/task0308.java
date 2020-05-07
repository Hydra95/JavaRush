package Java_Syntax.task.task02;

/*
Вывести на экран произведение 10 чисел от 1 до 10.
Результат - это 1 число.

Подсказка:
будет три миллиона с хвостиком.

Требования:
•	Программа должна выводить целое число на экран.
•	Метод main должен вызывать функцию System.out.println.
•	Выведенное число должно быть больше трех миллионов.
•	Выведенное число должно соответствовать заданию.
 */

public class task0308 {
    public static void main(String[] args) {
        int result = 1;
        for (int i = 2; i < 11; i++){
            result = result*i;
        }
        System.out.print(result);
    }
}
