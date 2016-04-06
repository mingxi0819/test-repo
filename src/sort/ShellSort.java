package sort;

import java.util.Arrays;

/**
 * Created by user on 16/4/5.
 */
public class ShellSort {
    public boolean isSort(int[] a){
        int len = a.length;
        for(int i=0;i<len-1;i++){
            if(a[i]>a[i+1]){
                return false;
            }
        }
         return true;
    }

    public void sort(int[] arr){
        int len = arr.length;
        int h = 1;

        while(h<len/3){
            h=h*3+1;
        }
        for(;h>=1;h=h/3) {
            for (int i = h; i < len; i++) {
                int key = arr[i];
                int j = i-h;
                while (j >= 0 && key < arr[j]) {
                    int temp = arr[j+h];
                    arr[j+h] = arr[j];
                    arr[j] = temp;
                    j = j - h;
                }
            }
        }
    }

    public static void main(String args[]){
        int[] a = {1,2,3,1,2,3,1,1,6,2,7,3,2,3};
        ShellSort ss = new ShellSort();
        System.out.println(Arrays.toString(a));
        ss.sort(a);
        System.out.println(Arrays.toString(a));



    }

}
