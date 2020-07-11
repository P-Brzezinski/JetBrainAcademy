import java.util.List;
import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        // write your code here
        List<String> vowels = List.of("a", "e", "u", "i", "o");
        String letter = String.valueOf(ch);
        if (vowels.contains(letter.toLowerCase())){
            return true;
        }else {
            return false;
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}