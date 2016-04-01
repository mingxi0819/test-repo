package sort;

/**
 * Created by user on 16/3/27.
 */
public class InsertionSort {

   public void insertionSort(int[] arr){
        int len = arr.length;
        for(int i=1;i<len;i++){
            int key = arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }


}
