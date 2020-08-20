import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // put your code here

        int rows, columns, x, y, temp = 0;
        Scanner s = new Scanner(System.in);
        rows = s.nextInt();
        columns = s.nextInt();

        int a[][] = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                a[i][j] = s.nextInt();
            }
        }

        x = s.nextInt();
        y = s.nextInt();
        for (int i = 0; i < rows; i++) {
            temp = a[i][(x)];
            a[i][x] = a[i][(y)];
            a[i][y] = temp;
        }

        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }


    }
}

