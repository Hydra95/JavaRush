package Java_Task_1;
/*
 * ����������:
�	� ������ main ������ ������ Man � ����� ������� ������ �� ���� � ���������� man.
�	� ������ main ������ ������ Woman � ����� ������� ������ �� ���� � ���������� woman.
�	� ������ main ������� ������ �� ����� ��������� ������ Woman � man.wife.
�	� ������ main ������� ������ �� ����� ��������� ������ Man � woman.husband.
�	����� Man ������ ��������� 3 ����������
�	����� Woman ������ ��������� 3 ����������
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


