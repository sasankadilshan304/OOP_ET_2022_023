package LW_01;

import java.util.Scanner;

public class Question_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an odd lenght word :- ");
        String word = scanner.nextLine();

        int lenght = word.length();

        System.out.println(word.charAt(lenght/2));


    }
}
