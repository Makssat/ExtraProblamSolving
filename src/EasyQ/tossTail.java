package EasyQ;


import java.util.Random;
import java.util.Scanner;

public class tossTail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String answer;
        do {
            System.out.println("Game started,Head or Tail");
            String word = input.nextLine();
            int randomNumber = random.nextInt();
            String flip = randomNumber == 0 ? "Head" : "Tail";
            if (flip.equalsIgnoreCase(word)) {
                System.out.println("This is your day!");
            } else {
                System.out.println("This is not your day!");
            }
            System.out.println("Do you wanna play again?Y/N");
             answer = input.nextLine();
        } while (answer.equalsIgnoreCase("Y"));
        System.out.println("Then see you next time");

    }



}
