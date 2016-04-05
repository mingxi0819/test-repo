package com.cb.unittest.sortTest;

import org.junit.Before;
import org.junit.*;
import sort.InsertionSort;
import sort.InsertionSort_2;
import sort.SelectionSort;

/**
 * Created by user on 16/3/27.
 */
public class SortTest {
    SelectionSort selectionsSort;
    InsertionSort insertionSort;
    InsertionSort_2 insertionSort_2;



    @Before
    public void setup(){
        selectionsSort = new SelectionSort();
        insertionSort = new InsertionSort();
        insertionSort_2 = new InsertionSort_2();
    }

    @Test
    public void testSelectionSort(){
        int arr[] = {2,1,4,8,5,0,2,6,3,4,1,0,9,8,7,6,5,6,2};
//        int[] exp = {0,1,2,2,4,5,8};
//        selectionsSort.selectionSort(arr);
//        insertionSort_2.insertionSort(arr);
//        Assert.assertArrayEquals(exp,arr);
        insertionSort_2.sort(arr);
        Assert.assertTrue(insertionSort_2.isSort(arr));

    }


}
