package arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int ar[] = {3,2,-1,6,7,3,1,9};
        int ar2[] = {3,-1,6,4,2,3,5};
        int n = ar.length;
        int n2 = ar2.length;
        System.out.println("Original array:");
        printArray(ar,n);
        reverseArray(ar,n);
        System.out.println("\nReversed array:");
        printArray(ar,n);

        System.out.println("Original array:");
        printArray(ar2,n2);
        reverseArray(ar2,n2);
        System.out.println("\nReversed array:");
        printArray(ar2,n2);

    }

    private static void printArray(int[] ar, int n){
        for(int i=0;i<n;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }

    private static int[] reverseArray(int[] ar, int n) {
        int i=0;
        int j = n-1;
        int temp;
        while(i<j){
            temp = ar[i];
            ar[i] = ar[j];
            ar[j] = temp;
            i++;
            j--;
        }
        return ar;
    }
}
