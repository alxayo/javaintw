package org.xayo.sort;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class ShellTest {
    // unsorted array
    private int[] sortedArr = {0, 2, 2, 4, 7, 9, 34, 38, 65, 83};
    private int[] notSortedArr = {4, 83, 2, 38, 7, 65, 2, 34, 0, 9};
    //
    private int[] dataEmpty = {};
    private int[] dataOneElement = {5};

    //sort algorithm
    private Shell shellsort = new Shell(5);

    @Test
    public void sortTest(){
        shellsort.sort(notSortedArr);
        assertTrue(isSorted(notSortedArr));
    }

    @Test
    public void sortSortedArrTest(){
        shellsort.sort(sortedArr);
        assertTrue(isSorted(sortedArr));
    }

    @Test
    public void sortEmptyTest(){
        shellsort.sort(dataEmpty);
        assertTrue(isSorted(dataEmpty));
    }

    @Test
    public void sortOneTest(){
        shellsort.sort(dataOneElement);
        assertTrue(isSorted(dataOneElement));
    }

    private boolean isSorted(int[] data){
        int arrLength = data.length;
        if(arrLength>1)
            for(int i=1;i<arrLength;i++)
                if(data[i-1]>data[i])
                    return false;
        return true;
    }
}//class