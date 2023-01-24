package FirstStepsExtra;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x =  Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double sideWall = x * y;
        double window =2.25;
        double wall = 2 * sideWall - 2 * window;
        double backWall = x * x;
        double door = 2.4;
        double walls = 2 * backWall - door;
        double wallsArea = walls +wall;
        double greenPaint = wallsArea /3.4;
        double rectanglesRoof = 2 * (x * y);
        double triangles = 2 * (x*h/2);
        double roofArea = rectanglesRoof + triangles;
        double redPaint = roofArea / 4.3;
        System.out.printf("%.2f %n", greenPaint);
        System.out.printf("%.2f", redPaint);
    }
}
