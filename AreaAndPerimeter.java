package FirstStepsExtra;

import java.util.Scanner;

public class AreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = Double.parseDouble(scanner.nextLine());
        double calculatedParameter = Math.PI * r * r;
        double calculatedArea =2*(Math.PI * r);
        System.out.printf("%.2f %n", calculatedParameter);
        System.out.printf("%.2f ", calculatedArea);
    }
}
