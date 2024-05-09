import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введіть п'ять слів:");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        String word4 = scanner.next();
        String word5 = scanner.next();

        System.out.println("Перші літери кожного слова:");
        String letter1 = word1.substring(0, 1);
        System.out.println("Перше слово: " + letter1);

        String letter2 = word2.substring(0, 1);
        System.out.println("Друге слово: " + letter2);

        String letter3 = word3.substring(0, 1);
        System.out.println("Третє слово: " + letter3);

        String letter4 = word4.substring(0, 1);
        System.out.println("Четверте слово: " + letter4);

        String letter5 = word5.substring(0, 1);
        System.out.println("П'яте слово: " + letter5);

        scanner.close();
    }


}
