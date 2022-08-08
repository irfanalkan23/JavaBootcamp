package day01;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        for (int i = 10; i >= 0; i--) {
            System.out.println("Europe Batch8 " + i);
        }

        System.out.println("-----------------------------------");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 1~5:");
        int num = input.nextInt();

        while(num > 5 || num < 1) {
            System.out.println("Invalid entry, please r-enter:");
            num = input.nextInt();
        }

        System.out.println("You have selected: "+num);





    }

}
