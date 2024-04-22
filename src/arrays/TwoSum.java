package arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int ar[] = {3,-2,1,4,3,6,8};
        int k = 10;
        //int[] res = findPair(ar,k);
        int[] res = findPairWithSum(ar,k);
        System.out.println(res[0]+" "+res[1]);

    }

    //no extra spane
    // O(n^2)
    private static int[] findPairWithSum(int[] ar, int k){
        int n = ar.length;
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                if(i==j){
                    continue;
                }
                if(ar[i]+ar[j]==k){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    //find a pair of elements such that ar[i] + ar[j] = k && i != j
    //takes extra space
    private static int[] findPair(int[] ar,int k) {
        int n = ar.length;
        int p =0;
        Map<Integer,Integer> hmap = new HashMap<>();
        for(int i =0;i<n;i++){
            p = k-ar[i];
            if(hmap.containsKey(p)){
                int r = hmap.get(p);
                return new int[]{r,i};
            }else{
                hmap.put(ar[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}
