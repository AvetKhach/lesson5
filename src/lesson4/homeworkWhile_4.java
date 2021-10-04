package lesson4;

import java.util.Scanner;

public class homeworkWhile_4 {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Please include number");
        int number = scanner.nextInt();
        int i =0;
        while (i !=number){
            System.out.println(i*i*i);
            i++;
        }
    }
}
