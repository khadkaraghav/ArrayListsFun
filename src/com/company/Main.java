package com.company;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();

        /*colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        System.out.println(colors);*/

        /*System.out.println("The value at index 1 is"); //getting value Green at index 1
        System.out.println(colors.get(1)); //printing value at 1*/

        Scanner input = new Scanner(System.in);
        String temp = "";

        while (!temp.equalsIgnoreCase("Q")) {
            System.out.println("Enter a new color to add to the list");
            temp = input.nextLine();


            if (!temp.equalsIgnoreCase("Q")) {
                colors.add(temp);
            }
        }
//            System.out.println("The stored colors are" + colors);
        for(String color: colors){
            System.out.println("The stored colors are"+color);
        }

    }
}







