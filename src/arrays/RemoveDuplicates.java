package arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] ar = new int[]{1,2,2,3,4,5,6,7,8,8,8,8,8,9,10}; //sorted array with duplicates.
        int n = ar.length;
        System.out.println("Total elements: "+ar.length);
        for(int i =0;i<n;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println("New array has "+removeDuplicates(ar,n)+" distinct elements.!");
        for(int i =0;i<n;i++){
            System.out.print(ar[i]+" ");
        }
    }
    private static int removeDuplicates(int[] ar, int n) {
        int res = 1;
        for(int i=1;i<n;i++){
            if(ar[i]!=ar[res-1]){
                ar[res] = ar[i];
                res++;
            }
        }
        return res;
    }
}
