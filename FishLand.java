package FirstStepsExtra;

import java.util.Scanner;

public class FishLand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mackerel = Double.parseDouble(scanner.nextLine());
        double sprat = Double.parseDouble(scanner.nextLine());
        double bonitoKg = Double.parseDouble(scanner.nextLine());
        double scadKg = Double.parseDouble(scanner.nextLine());
        int musselsKg = Integer.parseInt(scanner.nextLine());
        double bonito = mackerel + 0.6*mackerel;
        double priceBonito = bonito * bonitoKg;
        double scad = sprat + 0.8 * sprat;
        double priceScad = scad * scadKg;
        double priceMussels = musselsKg * 7.50;
        double total = priceBonito + priceMussels + priceScad;
        System.out.printf("%.2f", total);

    }
}