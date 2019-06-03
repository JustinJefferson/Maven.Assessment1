package com.zipcodewilmington.assessment1.part5;

import java.util.ArrayList;
public class Palindrome {

    public Integer countPalindromes(String input){

        // First Find all possible string combinations
        // Store them in an ArrayList
        ArrayList<String> strings = new ArrayList<String>();
        Integer length = 1;

        while(length <= input.length()){

            for(int i = 0; i < input.length(); i++) {
                if(i + length <= input.length()) {
                    strings.add(input.substring(i, i + length));
                }
                else {
                    break;
                }
            }

            length++;
        }


        // Second: for each string in the ArrayList
        // Check each one for a palindrome using StringBuilder reverse
        Integer count = 0;

        for(String check : strings) {
            StringBuilder reverse = new StringBuilder(check);
            reverse.reverse();
            if(check.equals(reverse.toString())) count++;
        }

        return count;
    }
}
