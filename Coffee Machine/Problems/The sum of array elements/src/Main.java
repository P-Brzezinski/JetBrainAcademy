import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] tab = new int[size];
        int sum = 0;

        for (int i = 0; i < tab.length; i++) {
            tab[i] = scanner.nextInt();
            sum += tab[i];
        }

        System.out.println(sum);
    }
}