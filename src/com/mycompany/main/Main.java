//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package com.mycompany.main;

import java.util.Scanner;

/**
 *
 * @author highe
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Number: ");
        int number=scanner.nextInt();
        if(number%5==0&&number%3==0)
            System.out.println("FizzBuzz");

        else if(number%5==0)
            System.out.println("Fizz");

        else if(number%3==0)
            System.out.println("Buzz");



        else
            System.out.println(number);


    }
}