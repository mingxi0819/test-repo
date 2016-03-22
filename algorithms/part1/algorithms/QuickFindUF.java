package part1.algorithms;

/**
 * Created by user on 16/3/1.
 */
public class QuickFindUF {

    private int[] id ;
    private int count ;

    public QuickFindUF(int n){
        count = n;
        for(int i = 0;i<n;i++){
            id[i]=i;
        }
    }

    public int find(int p ){
        return id[p];
    }

    public int count(){
        return count;
    }

    public void union (int p, int q){
        int pid = id[p];
        int qid = id[q];

        if (pid==qid) return;

        for(int i=0;i<count;i++){
            if(id[i]==qid){
                id[i]=pid;
            }
        }
    }



}
