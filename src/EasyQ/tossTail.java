package EasyQ;

import java.util.Random;
import java.util.Scanner;

public class tossTail {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random random=new Random();
        String answer;
        while(answer.equalsIgnoreCase("Y")){
            System.out.println("GAme started,make a guess !Head or Tail");
            
            System.out.println("Do want to play again?Y/N");
            answer=input.next();
        }
    }

}
