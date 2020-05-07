package Java_Syntax.task.task02;

/*Добавь метод public static int convertToSeconds(int hour) который будет конвертировать часы в секунды.
Вызови его дважды в методе main с любыми параметрами.
Результаты выведи на экран, каждый раз с новой строки.

Требования:
•	Добавь метод convertToSeconds, он должен быть public static, возвращать и принимать int.
•	Метод convertToSeconds должен переводить переданные часы в секунды.
•	Метод main должен дважды вызывать метод convertToSeconds.
•	Метод main должен выводить результаты вызова на экран, каждый раз с новой строки.
•	Метод convertToSeconds не должен ничего выводить на экран.
 */

public class task0312 {
    public static void main(String[] args) {
        System.out.println(convertToSeconds (10));
        System.out.println(convertToSeconds (5));
    }

    public static int convertToSeconds(int hour) {
        return hour * 3600;
    }
}