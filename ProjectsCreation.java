package FirstStepsLab;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int projectNum= Integer.parseInt(scan.nextLine());
        int hoursperproject =3;
        int hours = projectNum * hoursperproject;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.",
                name, hours, projectNum);
    }
}
