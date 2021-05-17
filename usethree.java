package com.training.first;

import java.util.Scanner;
public class usethree {
    public static void main(String[] args) {
       System.out.println( "Please enter first name");
       Scanner first = new Scanner(System.in);
       String firstname  = first.nextLine();
        System.out.println( "Please enter second name");
        Scanner second = new Scanner(System.in);
        String secondname  = second.nextLine();
        System.out.println( "Please enter third name");
        Scanner third = new Scanner(System.in);
        String thirdname  = third.nextLine();
        System.out.print( "HI ");
        System.out.print(thirdname);
        System.out.print (",");
        System.out.print(secondname);
        System.out.print(" and ");
        System.out.print(firstname);

    }
}
