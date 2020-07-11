import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int number = scanner.nextInt();
        int result;

        if (number % 2 == 1){
            result = number + 1;
        }else {
            result = number + 2;
        }

        System.out.println(result);
    }
}