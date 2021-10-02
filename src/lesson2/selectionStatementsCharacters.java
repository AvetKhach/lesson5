package lesson2;

public class selectionStatementsCharacters {
    public static void main(String[] args) {
        char ch1,ch2,ch3,max;
        ch1 = 'a';
        ch2 = 'g';
        ch3 = 'f';
        if (ch1 >= ch2){
            if (ch1 >= ch3){
                System.out.println("max is : " + ch1);
            }
            else{
                System.out.println("max is : " + ch3);
            }
        }
        else if(ch2 >= ch3){
            System.out.println("max is : " + ch2);
        }
        else{
            System.out.println("max is : "  + ch3);
        }
    }
}
