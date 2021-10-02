package lesson2;

public class selectionStatementsCarCrash {
    public static void main(String[] args) {
        boolean redIsHitFromBehind = true;
        boolean blackIsHitFromBehind = true;
        if (redIsHitFromBehind && blackIsHitFromBehind){
            System.out.println("Both are wrong");
        }
        else if (redIsHitFromBehind || blackIsHitFromBehind){
            System.out.println("One is wrong");
        }
        else{
            System.out.println("Invalid state");
        }
    }
}
