package string;

/**
 * Created by user:bo cui on 16/3/21.
 */
public class ReverseString {
    public static void main(String args[]){
        ReverseString rs = new ReverseString();
        char[] n ={'a','b','c','d','e'};
        rs.reverseChar(n);
        for(int i = 0;i<n.length;i++){
            System.out.println(n[i]);
        }
    }


    public void reverseChar(char[] n){
        int len = n.length;
        for(int i=0;i<n.length/2;i++){
            char temp = n [i];
            n[i]=n[len-i-1];
            n[len-i-1]=temp;
        }
    }

}
