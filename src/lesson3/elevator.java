package lesson3;

import java.util.Scanner;

public class elevator {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Please press required floor");
        int floor = scanner.nextInt();
        switch (floor){
            case 1:
                System.out.println("Going to floor 1");
                break;
            case 2:
                for (int i = 1; i <=2 ; i++) {
                    System.out.println("Going to floor " + i);
                }
                break;
            case 3:
                for (int i = 1; i <=3 ; i++) {
                    System.out.println("Going to floor " + i);
                }
                break;
            case 4:
                for (int i = 1; i <=4 ; i++) {
                    System.out.println("Going to floor " + i);
                }
                break;
            case 5 :
                for (int i = 1; i <=5 ; i++) {
                    System.out.println("Going to floor " + i);
                }
                break;
            default:{
                System.out.println("Mentioned floor is not exist");
            }
        }
    }
}
