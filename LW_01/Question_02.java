package LW_01;

import java.util.Scanner;

public class Question_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first name :- ");
        String firstName = scanner.nextLine();

        System.out.println("Enter the middle name :- ");
        String middleName = scanner.nextLine();

        System.out.println("Enter the last name :- ");
        String lastName = scanner.nextLine();

        String fullName = lastName + ", " + firstName + " " + middleName.charAt(0);
        System.out.println(fullName);

    }
}
