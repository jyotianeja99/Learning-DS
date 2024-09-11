package arrays;

import java.util.HashMap;
import java.util.Map;

public class IdenticalTwins {
    public static void main(String args[]){
        int[] arr = {1,2,3,2,1};
        int[] ar2 = {1, 2, 2, 3, 2, 1};
        int[] a = {4,1,1,1,1};
        int twins = findTwins(a);
        System.out.println(twins);

    }

    private static int findTwins(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int count =0;
        for(int i=0;i<n;i++){
            if(hmap.containsKey(arr[i])){
                count += hmap.get(arr[i]);
                hmap.put(arr[i],hmap.get(arr[i])+1);

            }else{
                hmap.put(arr[i],1);
            }
        }
        return count;
    }

    //need to understand this.
    int getIdenticalTwinsCount (int[] arr) {
        HashMap<Integer, Integer> frequency = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            Integer val = frequency.get(arr[i]);
            if(val == null) {
                frequency.put(arr[i], 1);
            } else {
                frequency.put(arr[i], ++val);
            }
        }
        int identicalTwinCount = 0;
        for (Map.Entry<Integer, Integer> x: frequency.entrySet()) {
            identicalTwinCount += (x.getValue() * (x.getValue() - 1)) / 2;
        }
        return identicalTwinCount;
    }


}
