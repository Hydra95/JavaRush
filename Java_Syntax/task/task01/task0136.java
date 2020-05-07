package Java_Syntax.task.task02;

/*
 метод getWeight(int), который принимает вес тела (в Ньютонах) на Земле, и возвращает, сколько это тело будет весить
  на Луне (в Ньютонах).
Требования:
•	Метод getWeight(int) должен быть публичным и статическим.
•	Метод getWeight должен возвращать значение типа double.
•	Метод getWeight не должен ничего выводить на экран.
•	Метод getWeight должен правильно переводить вес тела в Ньютонах на Земле в вес этого же тела на Луне, и возвращать
 это значение.
 */

public class task0136 {
    public static void main(String[] args) {
        System.out.println(getWeight(888));
    }

    public static double getWeight(int earthWeight) {

        double percentWeigth = earthWeight*0.17;
        return percentWeigth;

    }
}