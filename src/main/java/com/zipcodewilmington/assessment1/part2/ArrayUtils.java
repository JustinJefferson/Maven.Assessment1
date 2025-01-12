package com.zipcodewilmington.assessment1.part2;

import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {

        Integer count = 0;

        for(Object check : objectArray) {
            if(check.equals(objectToCount)) count++;
        }

        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Integer[] removeValue(Object[] objectArray, Object objectToRemove) {

        Integer removeIndexes = getNumberOfOccurrences(objectArray, objectToRemove);
        Object[] removedObjectArray = new Object[objectArray.length - removeIndexes];
        Integer index = 0;

        for(Object check : objectArray) {
            if(!check.equals(objectToRemove)) {
                removedObjectArray[index] = check;
                index++;
            }
        }

        Integer[] integerArray = Arrays.copyOf(removedObjectArray, removedObjectArray.length, Integer[].class);

        return integerArray;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {

        Integer highestCount = 0;
        Object most = null;

        for(Object check : objectArray) {
            Integer count = getNumberOfOccurrences(objectArray, check);
            if(count > highestCount) {
                most = check;
                highestCount = count;
            }
        }

        return most;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {

        Integer smallestCount = objectArray.length + 1;
        Object least = null;

        for(Object check : objectArray) {
            Integer count = getNumberOfOccurrences(objectArray, check);
            if(count < smallestCount) {
                least = check;
                smallestCount = count;
            }
        }

        return least;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Integer [] mergeArrays(Integer[] objectArray, Integer[] objectArrayToAdd) {

        Integer[] mergedArray = new Integer[objectArray.length + objectArrayToAdd.length];
        Integer index = 0;

        for(Integer check : objectArray) {
            mergedArray[index] = check;
            index++;
        }

        for(Integer check : objectArrayToAdd) {
            mergedArray[index] = check;
            index++;
        }

        return mergedArray;
    }
}
