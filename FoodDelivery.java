package FirstStepsExercise;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chicken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int vegetarian = Integer.parseInt(scanner.nextLine());
        double priceChicken = chicken * 10.35;
        double priceFish = fish * 12.40;
        double priceVegetarian = vegetarian * 8.15;
        double foodPrice = priceChicken + priceFish + priceVegetarian;
        double desertPrice = 0.2 * foodPrice;
        double price = foodPrice + desertPrice + 2.50;
        System.out.println(price);
    }
}
