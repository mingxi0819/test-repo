package sort;

/**
 * Created by user on 16/4/4.
 */
public class InsertionSort_2 {
    public void sort(int[] a){
        int N = a.length;

        for (int i = 1;i < N ; i++){
            int key = a[i];
            int j = i-1;
            while(key<a[j] && j>0){
                int temp = a[j+1];
                a[j+1] = a[j];
                a[j] = temp;
                j--;
            }
        }
    }

    public boolean isSort(int[] a){
        int N = a.length;
        for(int i=0;i<N-1;i++){
            if(a[i]>a[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){

        InsertionSort_2 is = new InsertionSort_2();
        int[] a = {1,3,2,5,4,6,7};
        is.sort(a);

        System.out.println(is.isSort(a));
    }
}
