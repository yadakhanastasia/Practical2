import java.util.Scanner;


    public class four {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введіть перше ім'я:");
            String firstname = scanner.nextLine();

            System.out.println("Введіть друге ім'я:");
            String secondname = scanner.nextLine();

            if (firstname.equalsIgnoreCase(secondname)) {
                System.out.println("Імена ідентичні.");
            } else {
                System.out.println("Імена не ідентичні.");
            }

            scanner.close();
        }
    }

