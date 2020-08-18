import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = Math.abs(j - i);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }
    }
}

//        Scanner scanner = new Scanner(System.in);
//
//        int n = scanner.nextInt();
//
//        int[][] tab = new int[n][n];
//
//        for (int i = 0; i < tab.length; i++) {
//            int[] innerTab = tab[i];
//            for (int j = 0; j < innerTab.length; j++) {
//                    innerTab[j] = 7;
//            }
//        }
//
//        for (int i = 0; i < tab.length; i++) {
//            int[] innerTab = tab[i];
//            for (int j = 0; j < innerTab.length; j++) {
//                if (i == j) {
//                    innerTab[j] = 0;
//                }else {
//                    innerTab[j] = i + j;
//                }
//            }
//        }
//
//        for (int[] ints : tab) {
//            for (int anInt : ints) {
//                System.out.print(anInt + " ");
//            }
//            System.out.println();
//        }
//    }
//}
