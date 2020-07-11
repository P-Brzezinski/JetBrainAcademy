import java.util.Arrays;
import java.util.List;
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

        boolean flag = true;

        for (int i = 0; i < tab.length - 1; i++) {
            if (tab[i] < tab[i+1]){
                flag = true;
            }else {
                flag = false;
                break;
            }
        }

        System.out.println(flag);
    }
}