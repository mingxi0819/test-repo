package sort;


import java.util.Arrays;

/**
 * Created by user on 16/3/27.
 */
public class SelectionSort {

    public static void selectionSort(int arr[]){
        int len = arr.length;
        for (int i=0;i<len-1;i++){
            int min = i;
            for (int j=i+1;j<len;j++){
                if(arr[j]< arr[min]) min = j;
            }

//           int temp = arr[min];
//            arr[min] = arr[i];
//            arr[i] = temp;

            if(i !=min ) {   //
                arr[i] = arr[i] + arr[min];
                arr[min] = arr[i] - arr[min];
                arr[i] = arr[i] - arr[min];
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,5,7,6};
        SelectionSort sort = new SelectionSort();
        sort.selectionSort(arr);
//        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr));

//        }
    }
}
