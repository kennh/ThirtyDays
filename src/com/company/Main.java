package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        String s = in.nextLine();

        if (s.equals("Caleb")) {
            System.out.println("Hey Caleb");
        } else if (s.equals("Sally")) {
            System.out.println("Hey Sally");
        } else {
            System.out.println("Hey " + s);
        }
        in.close();

//        int i = 0; //initialization
//        while (i < 10) {  //condition
//            System.out.println("i is: " + i);
//            i++; //update
//        }

//        int i = 0;
//        do {
//            System.out.println("i is: " + i);
//            i++;
//        } while(i < 10);

//        for(int i = 0; i < 10 ; i++){
//            System.out.println(i);
//        }
    }
}
