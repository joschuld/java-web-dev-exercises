package org.launchcode.java.Studios.countingcharacters;

import java.util.HashMap;
import java.util.Scanner;
//import java.util.regex

public class charCount {


    public static void main(String[] args) {
//        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
//        char[] charactersInString = quote.toCharArray();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter some words!: ");
        String enteredWord = input.nextLine();
        if (enteredWord.matches("^[^a-zA-Z0-9]+$")) {
            System.out.println("No non-alphanumeric characters!");
        }

        char[] wordCharArray = enteredWord.toCharArray();

        HashMap<Character, Integer> charStorage = new HashMap<>();
        for (char i : wordCharArray) {
            if (!charStorage.containsKey(i)) {
                charStorage.put(i, 1);
            } else {
                charStorage.put(i, charStorage.get(i) + 1);
            }
        }
        System.out.println(charStorage);





    }


}

