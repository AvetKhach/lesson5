package lesson4;

import java.util.Scanner;

public class homeworkWhile {
    public static void main(String[] args) {

        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Please include number");
        int number = scanner.nextInt();
        int i=1;
        int amount =0;
        int sum=0;
        if (number!=0){
            while (i!=number){
                if (i%2==0){
                    amount +=1;
                    sum+=i;
                }
                i++;
            }
            System.out.println("Here is arithmetic average :" + (sum/amount));
        }
    }

}
