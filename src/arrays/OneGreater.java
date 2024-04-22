package arrays;

public class OneGreater {
    public static void main(String[] args) {
        int[] ar = {2,3,10,7,3,10,2,10,10,10,10,9};
        System.out.println(findTotalNumsHavingGreaterThanItself(ar));
    }

    private static int findTotalNumsHavingGreaterThanItself(int[] ar) {
        int largest = Integer.MIN_VALUE;
        int count =0;
        int n = ar.length;
        for(int i =0;i<ar.length;i++){
            if(ar[i]>largest){
                largest = ar[i];
            }
        }
        for(int i =0;i<ar.length;i++){
            if(ar[i] == largest){
                count++;
            }
        }
        return n-count;
    }
}
