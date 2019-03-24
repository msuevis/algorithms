package com.miguel.suevis.algorithms.binarySearch;

/**
 * Binary Search algorith to search one element
 * over the list in sorted order
 *
 * @author <a href="miguelangelsuevis@gmail.com">miguel angel suevis</a>
 */
public class BinarySearch{

    /**
     * Implementation of Binary Search algorithm that Search a sorted array
     * by repeatedly dividing the search interval in half.
     *
     * @param listElement over the that execute the search.
     * @param elementToSearch to search.
     * @return the index of the element on the list.
     */
    public int binarySearch(int[] listElement, int elementToSearch){

        int low = 0;
        int high = listElement.length -1;

        while(low <= high){

            int middle = low + (high - low) / 2;
            int guess = listElement[middle];

            if(guess == elementToSearch){

                return middle;
            }else if(guess > elementToSearch){

                  high = middle - 1;
            }else {

                  low = middle + 1;
            }

        }

        return -1;
    }


}
