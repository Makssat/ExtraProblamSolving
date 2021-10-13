package Mentoring;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the word");
        String st1= input.nextLine();
        String reverse="";
        for(int i=st1.length()-1;i>=0;i--){
            reverse+=st1.charAt(i);
        }
        System.out.println(reverse);
    }
}
