package EasyQ;

import java.util.Scanner;

public class MultiplicationsTableOfNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a psotive number:");
        int number=input.nextInt();
        int beginning=1;
        while(beginning<11){
            System.out.println(number+"*"+beginning+"="+(number*beginning));
            beginning++;
        }
    }
}
