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

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        boolean flag = true;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == n){
                if (i + 1 < tab.length){
                    if (tab[i + 1] == m) {
                        flag = true;
                    }
                }
            }else if (!Arrays.asList(tab).contains(n) || !Arrays.asList(tab).contains(m)){
                flag = true;
            }else {
                flag = false;
            }
        }

        System.out.println(flag);
    }
}