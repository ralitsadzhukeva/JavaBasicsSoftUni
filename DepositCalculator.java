package FirstStepsExercise;

import java.util.Scanner;
public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double depositedAmount = Double.parseDouble(scanner.nextLine());
        int term = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());
        double sum = depositedAmount + term * ((depositedAmount * percent/100)/12);
        System.out.println(sum);
    }
}