package lesson4;

import java.util.Scanner;

public class homeworkWhile_3 {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Please include 5 numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        System.out.println("This is the sum of the numbers you entered : " + (a+b+c+d+e));

    }
}
