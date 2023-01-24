package FirstStepsLab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Dogfood = Integer.parseInt(scan.nextLine());
        int Catfood = Integer.parseInt(scan.nextLine());
        double pricedogfood = 2.5;
        int pricecatfood = 4;
        double price = (Dogfood * pricedogfood) + (Catfood * pricecatfood);

        System.out.printf( price + " lv");
    }
}