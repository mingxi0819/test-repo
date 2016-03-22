package part1.algorithms;

/**
 * Created by user on 16/3/21.
 */

public class WeightedQuickUnionUF {
    private int[] id;
    private int[] sz;
    private int count;  //number of connected part

    public WeightedQuickUnionUF(int n){

        id = new int[n];
        sz = new int[n];

        for(int i=0;i<n;i++){
            id[i] = i;
            sz[i]=1;
        }
        count = n;
    }

    public int count(){
        return count;
    }

    public boolean connected(int p, int q){
        return find(p)==find(q);
    }

    public int find(int p){
        while(id[p]!=p){
            p = id[p];
        }
        return p;
    }

    public void union(int p , int q ){
        int i = find(p);
        int j = find(q);

        if (i==j)
                return ;
        else {
            if (sz[i]>=sz[j]){
                id[j]=i;
                sz[i]+=sz[j];
            }else {
                id[i]=j;
                sz[j]+=i;
            }
            count--;
        }
    }
}
