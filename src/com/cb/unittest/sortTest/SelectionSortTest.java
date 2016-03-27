package com.cb.unittest.sortTest;

import org.junit.Before;
import org.junit.*;
import sort.SelectionSort;

/**
 * Created by user on 16/3/27.
 */
public class SelectionSortTest {
    SelectionSort sort;

    @Before
    public void setup(){
        sort = new SelectionSort();
        int arr[] = {2,1,4};
    }

    @Test
    public void testSelectionSort(){
        int arr[] = {2,1,4,8,5,0,2};
        int[] exp = {0,1,2,2,4,5,8};
        sort.selectionSort(arr);

        Assert.assertArrayEquals(exp,arr);

    }

}
