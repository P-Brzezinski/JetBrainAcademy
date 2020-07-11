import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int[] tab = new int[5];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = scanner.nextInt();
        }

        int rotate = scanner.nextInt();
        int i = 0;

        tab[i + 1] = tab[i];
        tab[i + 2] = tab[i + 1];
        tab[i + 3] = tab[i + 2];
        tab[i + 4] = tab[i + 3];
        tab[i] = tab[i + 4];

        for (int j : tab) {
            System.out.print(j + " ");
        }
    }
}