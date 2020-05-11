package Java_Syntax.task.task03;

/*
Напиши код метода sumDigitsInNumber(int number). Метод на вход принимает целое трехзначное число. Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.
Пример:
Метод sumDigitsInNumber вызывается с параметром 546.
Пример вывода:
15
Требования:
Программа не должна считывать данные с клавиатуры.
Метод sumDigitsInNumber(int) должен быть публичным и статическим.
Метод sumDigitsInNumber должен возвращать значение типа int.
Метод sumDigitsInNumber не должен ничего выводить на экран.
Метод sumDigitsInNumber должен правильно возвращать сумму всех цифр в числе number.
 */

public class task0132 {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += number%10;
            number /= 10;
        }
        return sum;
    }
}
