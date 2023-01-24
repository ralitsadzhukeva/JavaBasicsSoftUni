package FirstStepsExtra;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceVeggie = Double.parseDouble(scanner.nextLine());
        double priceFruit = Double.parseDouble(scanner.nextLine());
        int kgVeggie = Integer.parseInt(scanner.nextLine());
        int kgFruit = Integer.parseInt(scanner.nextLine());
        double priceBGN = priceVeggie * kgVeggie + priceFruit * kgFruit;
        double priceEuro = priceBGN / 1.94;
        System.out.printf("%.2f", priceEuro);
    }
}
