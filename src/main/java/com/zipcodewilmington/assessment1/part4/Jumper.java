package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {

        Integer flagHeight = k;
        Integer jumpHeight = j;
        Integer currentHeight = 0;
        Integer jumps = 0;

        while(currentHeight < flagHeight) {
            if(currentHeight + jumpHeight <= flagHeight) {
                currentHeight += jumpHeight;
            }
            else {
                currentHeight++;
            }

            jumps++;
        }

        return jumps;
    }
}
