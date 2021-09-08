package EasyQ;

import java.util.Scanner;

public class findingFactorial {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a positive value");
        int numb= input.nextInt();
        int firstNum=1;
        while(firstNum<=numb){
            int factorial=numb*firstNum;
            firstNum++;
            System.out.println(factorial);

        }

    }
}
