package LW_01;

import java.util.Scanner;

public class Question_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your height in centimeters : ");
        double value = Double.parseDouble(scanner.nextLine());

        double inches = value / 2.54;
        System.out.println("Your height in inches is: " + inches);

    }
}
