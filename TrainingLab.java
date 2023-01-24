package FirstStepsExtra;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double numWidth = Math.floor((width-1)/0.7);
        double numLength = Math.floor(length/1.20);
        double total = (numWidth*numLength) - 3;

        System.out.printf("%.0f",total );
    }
}