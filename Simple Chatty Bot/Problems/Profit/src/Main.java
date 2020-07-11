import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);

        double money = scanner.nextInt();
        double percent = scanner.nextInt();
        double moneyLimit = scanner.nextInt();
        int loops = 0;

        while (money < moneyLimit){
            money = money + (money*percent/100);
            loops++;
        }
        System.out.println(loops);
    }
}