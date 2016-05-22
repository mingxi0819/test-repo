package sort;

/**
 * Created by user on 16/4/25.
 */
public class QuickSort {

    private static int partition(Comparable[] a ,int lo,int hi){
        int i= lo, j= hi +1;
        while(true){
            while(less(a[++i],a[lo]))
                if(i==hi) break;

            while(less(a[lo],a[--j])){
                if(j==lo) break;
            }

            if(i>=j) break;
            exchange(a,i,j);



            
        }

        exchange (a,lo,j);
                return j;


    }
}
