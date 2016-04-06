package com.cb.unittest.sortTest;

import org.junit.Before;
import org.junit.*;
import sort.InsertionSort;
import sort.InsertionSort_2;
import sort.SelectionSort;
import sort.ShellSort;

/**
 * Created by user on 16/3/27.
 */
public class SortTest {
    SelectionSort selectionsSort;
    InsertionSort insertionSort;
    InsertionSort_2 insertionSort_2;
    ShellSort st;

    @Before
    public void setup(){
        selectionsSort = new SelectionSort();
        insertionSort = new InsertionSort();
        insertionSort_2 = new InsertionSort_2();
        st = new ShellSort();
    }

    @Test
    public void testSelectionSort(){
        int arr1[] = {2,1,4,8,5,0,2,6,3,4,1,0,9,8,7,6,5,6,2,3,2,5,4,6,7,8,9,2,3,4,6,8,4,2,4,7,9,4,2,4,8,9,4,12,5,8,4,3,2,5,0,2,4};
        int arr2[] = {2,1,4,8,5,0,2,6,3,4,1,0,9,8,7,6,5,6,2,3,2,5,4,6,7,8,9,2,3,4,6,8,4,2,4,7,9,4,2,4,8,9,4,12,5,8,4,3,2,5,0,2,4};
//        int[] exp = {0,1,2,2,4,5,8};
//        selectionsSort.selectionSort(arr);
//        insertionSort_2.insertionSort(arr);
//        Assert.assertArrayEquals(exp,arr);
        insertionSort_2.sort(arr1);
        st.sort(arr2);
        Assert.assertTrue(insertionSort_2.isSort(arr1));
        Assert.assertTrue(st.isSort(arr2));

    }


}
