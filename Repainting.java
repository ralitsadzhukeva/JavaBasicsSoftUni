package FirstStepsExercise;

import java.util.Scanner;
public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double priceNylon = (nylon + 2 ) * 1.50;
        double pricePaint = (paint + 0.1*paint) * 14.5;
        double priceThinner = thinner * 5;
        double priceMaterials = priceNylon + pricePaint + priceThinner + 0.4;
        double workers = (priceMaterials * 0.3) * hours;
        double price = workers + priceMaterials;
        System.out.println(price);
    }
}