package FirstStepsExercise;

import java.util.Scanner;
public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int priceAYear = Integer.parseInt(scanner.nextLine());
        double shoes = priceAYear - 0.4*priceAYear;
        double clothes = shoes - 0.2*shoes;
        double ball = clothes / 4;
        double accessories =  ball / 5;
        double price = priceAYear + shoes + clothes + ball + accessories;
        System.out.println(price);
    }
}
