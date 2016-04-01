package com.cb.unittest.sortTest;

import org.junit.Before;
import org.junit.*;
import sort.InsertionSort;
import sort.SelectionSort;

/**
 * Created by user on 16/3/27.
 */
public class SortTest {
    SelectionSort selectionsSort;
    InsertionSort insertionSort;

    @Before
    public void setup(){
        selectionsSort = new SelectionSort();
        insertionSort = new InsertionSort();
    }

    @Test
    public void testSelectionSort(){
        int arr[] = {2,1,4,8,5,0,2};
        int[] exp = {0,1,2,2,4,5,8};
//        selectionsSort.selectionSort(arr);
        insertionSort.insertionSort(arr);
        Assert.assertArrayEquals(exp,arr);

    }


}
