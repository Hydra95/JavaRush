package Java_Syntax.task.task02;

/*
Требования:
Программа не должна выводить текст на экран.
В методе main создай объекты типа Cat, Dog, Fish, Woman занеси их ссылки в переменные.
В методе main присвойте каждому животному владельца Woman.
Класс Cat, Dog, Fish должен содержать только одну переменную Woman owner.
Класс Woman не должен содержать переменных.
 */

public class task0213 {
    public static void main(String[] args) {

        Woman woman = new Woman();
        Cat cat = new Cat();
        cat.owner = woman;
        Dog dog = new Dog();
        dog.owner = woman;
        Fish fish = new Fish();
        fish.owner = woman;
    }

    public static class Cat {
        public Woman owner;
    }

    public static class Dog {
        public Woman owner;
    }

    public static class Fish {
        public Woman owner;
    }

    public static class Woman {
    }
}
