import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int input = 1;
        String output = "";


        do {
            input = scanner.nextInt();
            if (input % 2 == 0 && input != 0) {
                output = output + "even\n";
            }
            if (input % 2 != 0 && input != 0) {
                output = output + "odd\n";
            }
        } while (input != 0);
        System.out.println(output);
    }
}