import java.util.Scanner;

public class three {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть три числа:");

        double number1, number2, number3;

        if (scanner.hasNextDouble()) {
            number1 = scanner.nextDouble();
        } else {
            System.out.println("Помилка: введено не дробове число.");
            scanner.close();
            return;
        }

        if (scanner.hasNextDouble()) {
            number2 = scanner.nextDouble();
        } else {
            System.out.println("Помилка: введено не дробове число.");
            scanner.close();
            return;
        }

        if (scanner.hasNextDouble()) {
            number3 = scanner.nextDouble();
        } else {
            System.out.println("Помилка: введено не дробове число.");
            scanner.close();
            return;
        }

        if (number1 > number2 && number1 > number3) {
            System.out.println("Найбільше дробове число: " + number1);
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("Найбільше дробове число: " + number2);
        } else if (number3 > number1 && number3 > number2) {
            System.out.println("Найбільше дробове число: " + number3);
        } else {
            System.out.println("Усі числа рівні.");
        }

        scanner.close();
    }
}
