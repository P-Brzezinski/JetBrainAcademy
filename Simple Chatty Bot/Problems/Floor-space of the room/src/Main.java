import java.util.Map;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String shape = scanner.nextLine();
        double area;
        double resArea;

        switch (shape) {
            case "triangle":
                double a1 = scanner.nextDouble();
                double b1 = scanner.nextDouble();
                double c1 = scanner.nextDouble();
                area = (a1 + b1 + c1) / 2.0d;
                resArea = Math.sqrt(area * (area - a1) * (area - b1) * (area - c1));
                System.out.println(resArea);
                break;
            case "rectangle":
                double a2 = scanner.nextDouble();
                double b2 = scanner.nextDouble();
                area = a2 * b2;
                System.out.println(area);
                break;
            case "circle":
                double a3 = scanner.nextDouble();
                area = 3.14 * (a3*a3);
                System.out.println(area);
                break;
        }
    }
}