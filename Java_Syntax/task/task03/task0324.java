package Java_Syntax.task.task03;

/*
Вывести на экран десять раз надпись "Я хочу большую зарплату, и для этого изучаю Java"
Требования:
Программа не должна считывать данные с клавиатуры.
Программа должна выводить текст.
Текст должен начинаться с "Я хочу".
Текст должен заканчиваться на "изучаю Java".
Текст должен состоять из 10 строк.
Выводимый текст должен соответствовать заданию.
 */

public class task0324 {
    public static void main(String[] args) {
        int i=0;
        while (i<10) {
            System.out.println("Я хочу большую зарплату, и для этого изучаю Java");
            i++;
        }
    }
}
