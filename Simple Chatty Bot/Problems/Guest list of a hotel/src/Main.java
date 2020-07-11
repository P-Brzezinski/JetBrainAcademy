//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner sc = new Scanner(System.in);

        String name1 = sc.next();
        String name2 = sc.next();
        String name3 = sc.next();
        String name4 = sc.next();
        String name5 = sc.next();
        String name6 = sc.next();
        String name7 = sc.next();
        String name8 = sc.next();

        String[] tab = {name8, name7, name6, name5, name4, name3, name2, name1};

        for (String s : tab) {
            System.out.println(s);
        }
    }
}