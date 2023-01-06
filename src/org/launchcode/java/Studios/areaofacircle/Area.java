package org.launchcode.java.Studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius:");
        int userNum = input.nextInt();
        System.out.println("You entered: " + userNum);
        input.close();

        System.out.println("The area of a circle of radius " + userNum + " is: " + calcAreaCircle(userNum));



    }

    public static double calcAreaCircle(double n1) {
        return Circle.getArea(n1);
    }




}
