import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int number4 = scanner.nextInt();

        System.out.println(--number1 + " " + --number2 + " " + --number3 + " " + --number4);

        int n = 0;
        System.out.println(++n);
        System.out.println(n++);
        System.out.println(n++);

        char c = '1' + '3';
        System.out.println(c);
    }
}