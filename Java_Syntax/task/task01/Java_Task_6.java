package Java_Task_1;

/*
 * Требования:
Метод convertCelsiusToFahrenheit(int) должен быть публичным и статическим.
Метод convertCelsiusToFahrenheit должен возвращать значение типа double.
Метод convertCelsiusToFahrenheit не должен ничего выводить на экран.
Метод convertCelsiusToFahrenheit должен правильно переводить градусы Цельсия в градусы Фаренгейта и возвращать это число.
*/
 
public class Java_Task_6 {
	public static void main(String[] args) {
        System.out.println(convertCelsiusToFahrenheit(41));
    }

    public static double convertCelsiusToFahrenheit(int celsius) {
        double tf = (celsius * 9.0/5.0)+32.0;

        return tf;
    }
}

