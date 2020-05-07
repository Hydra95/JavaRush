package Java_Syntax.task.task02;

/*
Напиши код метода convertEurToUsd, который переводит евро в доллары по заданному курсу.
Для возврата результата из метода convertEurToUsd используй оператор return. Пример: return 123*435;
Вызови метод convertEurToUsd дважды в методе main с любыми параметрами.
Результаты выведи на экран, каждый раз с новой строки.

Подсказка:
Расчет выполняется по формуле: долларСША = евро * курс

Требования:
•	Метод convertEurToUsd должен умножать евро на курс и возвращать полученный результат.
•	Метод main должен 2 раза вызвать метод convertEurToUsd с любыми параметрами.
•	Метод main должен выводить результаты вызовов на экран, каждый раз с новой строки.
•	Метод convertEurToUsd не должен ничего выводить на экран.
 */

public class task0303 {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd (10, 1.15));
        System.out.println(convertEurToUsd (100, 1.15));
    }

    public static double convertEurToUsd(int eur, double course) {
        double dollar = eur * course;
        return dollar;
    }
}
