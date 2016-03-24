package part1.algorithms;

/**
 * Created by user on 16/3/1.
 */
public class QuickUnionUF {
    private int[] id;

    public QuickUnionUF(int n ){
        id = new int[n];
        for(int i=0;i<n;i++){
            id[i]=i;
        }
    }

    private int find(int i){
        while (i != id[i]){
            i = id[i];
        }
        return i;
    }

    private void union(int p,int q){
        if (find(p)==find(q)){
            return;
        }
        id[find(p)]=find(q);
    }



}
