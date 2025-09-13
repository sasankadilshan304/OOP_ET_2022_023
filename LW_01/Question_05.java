package LW_01;

import java.util.Scanner;
public class Question_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the outer circle (ro): ");
        double ro = scanner.nextDouble();

        System.out.print("Enter the radius of the inner circle (ri): ");
        double ri = scanner.nextDouble();

        Circle outerCircle = new Circle(ro);
        Circle innerCircle = new Circle(ri);

        double outerArea = outerCircle.computeArea();
        double innerArea = innerCircle.computeArea();

        double shadedArea = outerArea - innerArea;

        System.out.printf("Area of outer circle: %.2f\n", outerArea);
        System.out.printf("Area of inner circle: %.2f\n", innerArea);
        System.out.printf("Area of shaded region: %.2f\n", shadedArea);

    }
}
