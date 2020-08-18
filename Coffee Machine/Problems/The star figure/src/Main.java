import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = n / 2;

        String[][] matrix = new String[n][n];

        for (int i = 0; i < matrix.length; i++) {
            String[] innerTab = matrix[i];
            for (int i1 = 0; i1 < innerTab.length; i1++) {
                innerTab[i1] = ".";
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            String[] innerTab = matrix[i];
            for (int j = 0; j < innerTab.length; j++) {
                if (i == j) {
                    innerTab[j] = "*";
                } else if (i == n - j - 1) {
                    innerTab[j] = "*";
                } else if (i == k) {
                    innerTab[j] = "*";
                } else if (j == k) {
                    innerTab[j] = "*";
                }
            }
        }

        for (String[] strings : matrix) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }
}
