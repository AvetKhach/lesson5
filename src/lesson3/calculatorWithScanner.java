package lesson3;

import java.util.Scanner;

public class calculatorWithScanner {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Please include first number");
        int first = scanner.nextInt();
        System.out.println("Please include second number");
        int second = scanner.nextInt();
        System.out.println("Please include option (a = add,s = sub,m = mul,d = div)");
        String option = scanner.next();
        switch (option) {
            case "a":
                System.out.println("Our result is " + (first+second));
                break;
            case "s":
                System.out.println("Our result is " + (first-second));
                break;
            case "m":
                System.out.println("Our result is " + (first*second));
                break;
            case "d":
                if(second==0){
                    System.out.println("Included number 0 ");
                }
                else if (first<second){
                    System.out.println("Included first number is smaller ");
                }else {
                    System.out.println("Our result is " + (first/second));
                }
                break;
        }
    }
}
