import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();

        word1 = word1.replace(" ", "");
        word2 = word2.replace(" ", "");

        System.out.println(word1.equals(word2));

    }
}