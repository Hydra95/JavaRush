package Java_Task_1;
/*
 * “ребовани€:
Х	¬ методе main создай объект Man и сразу сохрани ссылку на него в переменную man.
Х	¬ методе main создай объект Woman и сразу сохрани ссылку на него в переменную woman.
Х	¬ методе main сохрани ссылку на ранее созданный объект Woman в man.wife.
Х	¬ методе main сохрани ссылку на ранее созданный объект Man в woman.husband.
Х	 ласс Man должен содержать 3 переменные
Х	 ласс Woman должен содержать 3 переменные
*/
//package com.javarush.task.task02.task0204;

public class Java_Task_5 {
	public static void main(String[] args) {
        Man man = new Man();
        Woman woman = new Woman();
        
        man.wife = woman;
        woman.husband =  man;
    }

    public static class Man {
        public int age;
        public int height;
        public Woman wife;
    }

    public static class Woman {
        public int age;
        public int height;
        public Man husband;
    }
}


