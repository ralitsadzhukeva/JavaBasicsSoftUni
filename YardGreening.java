package FirstStepsLab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double area = Double.parseDouble(scan.nextLine());
        double price = 7.61;
        double discount = 0.18;
        double finalPrice = area * price;
        double finalDiscount = discount * finalPrice;
        double finalSum = finalPrice - finalDiscount;

        System.out.printf("The final price is: %.2f lv.%n",finalSum);
        System.out.printf("The discount is: %.2f lv.",finalDiscount);
    }
}

