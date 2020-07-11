import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[] tab = new int[size];

        for (int i = 0; i < size; i++) {
            tab[i] = scanner.nextInt();
        }

        Arrays.sort(tab);

        int result = tab[tab.length - 1] * tab[tab.length - 2];

        System.out.println(result);
    }
}