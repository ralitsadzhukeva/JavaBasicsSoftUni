package FirstStepsExercise;

import java.util.Scanner;
public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int cleaning = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());
        double pensPrice = pens* 5.80;
        double markerPrice = markers * 7.20;
        double cleaningPrice = cleaning * 1.20;
        double all = pensPrice + markerPrice + cleaningPrice;
        double priceDiscount = all - (all * discount / 100);
        System.out.println(priceDiscount);
    }
}
