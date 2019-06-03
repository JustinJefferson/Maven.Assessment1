package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {

        String result = "";

        for(int i = 0; i < str.length(); i++) {
            if(i == 0){

                String upper = String.valueOf(str.charAt(i));
                upper = upper.toUpperCase();
                result += upper;

            }
            else {
                result += str.charAt(i);
            }
        }
        return result;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {

        StringBuilder builder = new StringBuilder(str);
        builder.reverse();
        String reversed = builder.toString();
        return reversed;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {

        String reverseCamel = reverse(str);
        reverseCamel = camelCase(reverseCamel);
        return reverseCamel;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {

        String result = "";

        for(int i = 0; i < str.length(); i ++) {

            if((i == 0) || (i == str.length() - 1)) {
                //Do Nothing
            }
            else {
                result += str.charAt(i);
            }
        }

        return result;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {

        String result = "";

        for(int i = 0; i < str.length(); i++) {
            char check = str.charAt(i);

            if(Character.isLowerCase(check)) {
                check = Character.toUpperCase(check);
            }
            else if(Character.isUpperCase(check)) {
                check = Character.toLowerCase(check);
            }

            result += check;

        }

        return result;
    }
}
