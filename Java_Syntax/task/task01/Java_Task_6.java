package Java_Task_1;

/*
 * ����������:
����� convertCelsiusToFahrenheit(int) ������ ���� ��������� � �����������.
����� convertCelsiusToFahrenheit ������ ���������� �������� ���� double.
����� convertCelsiusToFahrenheit �� ������ ������ �������� �� �����.
����� convertCelsiusToFahrenheit ������ ��������� ���������� ������� ������� � ������� ���������� � ���������� ��� �����.
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

