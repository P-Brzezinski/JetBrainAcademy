package machine;

import java.util.Scanner;

public class CoffeeMachine {

    private static Scanner sc = new Scanner(System.in);


    //ESPRESSO
    private static int ESPRESSO_WATER = 250;
    private static int ESPRESSO_COFFEE_BEANS = 16;
    private static int ESPRESSO_MONEY = 4;

    //LATTE
    private static int LATTE_WATER = 350;
    private static int LATTE_MILK = 75;
    private static int LATTE_COFFEE_BEANS = 20;
    private static int LATTE_MONEY = 7;

    //CAPPUCCINO
    private static int CAPPUCCINO_WATER = 200;
    private static int CAPPUCCINO_MILK = 100;
    private static int CAPPUCCINO_COFFEE_BEANS = 12;
    private static int CAPPUCCINO_MONEY = 6;

    //RESOURCES AVAILABLE
    private static int WATER_AVAILABLE = 400;
    private static int MILK_AVAILABLE = 540;
    private static int COFFEE_BEANS_AVAILABLE = 120;
    private static int COFFEE_CUPS_AVAILABLE = 9;
    private static int MONEY_IN_MACHINE = 550;

    public static void main(String[] args) {

        boolean flag = true;

        while (flag) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = sc.next();
            switch (action) {
                case "buy":
                    buyAction();
                    break;
                case "fill":
                    fillAction();
                    break;
                case "take":
                    takeAction();
                    break;
                case "remaining":
                    printStatus();
                    break;
                case "exit":
                    flag = false;
                    break;
            }
        }
    }


    private static void takeAction() {
        System.out.println("I gave you " + MONEY_IN_MACHINE);
        MONEY_IN_MACHINE = 0;
    }

    private static void fillAction() {
        System.out.println("Write how many ml of water do you want to add:");
        WATER_AVAILABLE += sc.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        MILK_AVAILABLE += sc.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        COFFEE_BEANS_AVAILABLE += sc.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        COFFEE_CUPS_AVAILABLE += sc.nextInt();
    }

    private static void buyAction() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String coffee = sc.next();
        switch (coffee) {
            case "1":
                if (WATER_AVAILABLE < ESPRESSO_WATER) {
                    System.out.println("Sorry, not enough water!");
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    buyEspresso();
                }
                break;
            case "2":
                if (WATER_AVAILABLE < LATTE_WATER) {
                    System.out.println("Sorry, not enough water!");
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    buyLatte();
                }
                break;
            case "3":
                if (WATER_AVAILABLE < CAPPUCCINO_WATER) {
                    System.out.println("Sorry, not enough water!");
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    buyCappuccino();
                }
                break;
            case "back":
                break;
        }
    }


    private static void buyEspresso() {
        WATER_AVAILABLE -= ESPRESSO_WATER;
        COFFEE_BEANS_AVAILABLE -= ESPRESSO_COFFEE_BEANS;
        MONEY_IN_MACHINE += ESPRESSO_MONEY;
        COFFEE_CUPS_AVAILABLE--;
    }

    private static void buyLatte() {
        WATER_AVAILABLE -= LATTE_WATER;
        MILK_AVAILABLE -= LATTE_MILK;
        COFFEE_BEANS_AVAILABLE -= LATTE_COFFEE_BEANS;
        MONEY_IN_MACHINE += LATTE_MONEY;
        COFFEE_CUPS_AVAILABLE--;
    }

    private static void buyCappuccino() {
        WATER_AVAILABLE -= CAPPUCCINO_WATER;
        MILK_AVAILABLE -= CAPPUCCINO_MILK;
        COFFEE_BEANS_AVAILABLE -= CAPPUCCINO_COFFEE_BEANS;
        MONEY_IN_MACHINE += CAPPUCCINO_MONEY;
        COFFEE_CUPS_AVAILABLE--;
    }

    private static void printStatus() {
        System.out.println("The coffee machine has");
        System.out.println(WATER_AVAILABLE + " of water");
        System.out.println(MILK_AVAILABLE + " of milk");
        System.out.println(COFFEE_BEANS_AVAILABLE + " of coffee beans");
        System.out.println(COFFEE_CUPS_AVAILABLE + " of disposable cups");
        System.out.println(MONEY_IN_MACHINE + " of money");
    }
}
