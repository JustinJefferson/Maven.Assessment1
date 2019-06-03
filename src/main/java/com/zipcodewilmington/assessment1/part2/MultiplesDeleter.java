package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {

        ArrayList<Integer> oddsList = new ArrayList<Integer>();

        for(Integer num : ints){
            if(num % 2 != 0) oddsList.add(num);
        }

        Integer[] odds = listToArray(oddsList);

        return odds;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {

        ArrayList<Integer> evensList = new ArrayList<Integer>();

        for(Integer num : ints) {
            if(num % 2 == 0) evensList.add(num);
        }

        Integer[] evens = listToArray(evensList);

        return evens;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {

        ArrayList<Integer> notMultiplesof3List = new ArrayList<Integer>();

        for(Integer num : ints) {
            if(num % 3 != 0) notMultiplesof3List.add(num);
        }

        Integer[] notMultiplesof3 = listToArray(notMultiplesof3List);

        return notMultiplesof3;
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {

        ArrayList<Integer> notMulitplesOfNList = new ArrayList<Integer>();

        for(Integer num : ints) {
            if(num % multiple != 0) notMulitplesOfNList.add(num);
        }

        Integer[] notMultiplesOfN = listToArray(notMulitplesOfNList);

        return notMultiplesOfN;
    }

    private Integer[] listToArray(ArrayList<Integer> list) {
        Integer[] convert = new Integer[list.size()];
        for(int i = 0; i < convert.length; i++) {
            convert[i] = list.get(i);
        }
        return convert;
    }
}
