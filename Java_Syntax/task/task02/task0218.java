package Java_Syntax.task.task02;

/*
Требования:
Программа должна выводить текст на экран.
Метод main не должен вызывать функцию System.out.println или System.out.print.
Метод print3 должен выводить текст на экран.
Метод main должен вызвать метод print3 только один раз.
Метод print3 должен выводить на экран строку 3 раза. Каждый раз с новой строки.
 */

public class task0218 {
    public static void print3(String s) {
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);

    }

    public static void main(String[] args) {
        print3("I love you!");
    }
}
