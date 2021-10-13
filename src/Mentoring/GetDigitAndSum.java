package Mentoring;

import java.util.Scanner;

public class GetDigitAndSum {
    public static void main(String[] args) {
      /*  int number=123;
        int firstDigit=number%10;
        number=number/10;
        int se
   */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter  a number");
        int number= scan.nextInt();
        int sum=0;
        int multiple=1;
        while(number!=0){
            int digit=number%10;
            sum+=digit;
            multiple*=digit;
            number/=10;
        } System.out.println(sum);
        System.out.println(multiple);

    }

}
