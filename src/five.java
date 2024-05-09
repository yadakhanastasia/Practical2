import java.util.Scanner;

public class five {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Введіть перший рядок:");
    String line1 = scanner.nextLine();

    System.out.println("Введіть другий рядок:");
    String line2 = scanner.nextLine();

    int linelength1 = line1.length();
    int linelength2 = line2.length();

    if (linelength1 > linelength2) {
        System.out.println("Перший рядок має більше символів.");
    } else if (linelength2 > linelength1) {
        System.out.println("Другий рядок має більше символів.");
    } else {
        System.out.println("Рядки мають однакову кількість символів.");
    }

    scanner.close();
}
}
