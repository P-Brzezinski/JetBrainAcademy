import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int input;
        List<Integer> tab = new ArrayList();

        do {
            input = scanner.nextInt();
            if (input != 0){
                tab.add(input);
            }
        }while (input != 0);

        System.out.println(tab.size());
    }
}