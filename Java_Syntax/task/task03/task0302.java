package Java_Syntax.task.task02;

/*
Добавь метод public static void printString(String s), в нем напиши код,
 который будет выводить переданную строку на экран.

Требования:
•	Добавь метод printString, у которого аргумент имеет тип String.
•	Метод printString должен быть void.
•	Метод printString должен быть static.
•	Метод printString должен быть public.
•	Метод printString должен выводить переданный текст на экран.
•	Программа должна вывести "Hello, Amigo!".
 */
public class task0302 {
    public static void printString(String s){
       System.out.print(s.toString());
    }
        public static void main (String[]args){
            printString("Hello, Amigo!");
        }
    }
