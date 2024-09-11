package arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] ar = {0,20,0,10,0,50,36,29,0,14,0,34,0,0};
        int n = ar.length;
        System.out.println("Original array:");
        for(int i = 0;i<n;i++){
            System.out.print(ar[i]+" ");
        }
        moveZeroesRight(ar,n);
        System.out.println("\nNew array:");
        for(int i = 0;i<n;i++){
            System.out.print(ar[i]+" ");
        }
    }

    private static void moveZeroesRight(int[] ar, int n) {
        int count =-1;
        for(int i =0;i<n;i++) {
            if (ar[i] == 0 && count<0) {
                count = i;
            }
            else if(count > -1 && ar[i]>0) {
                ar[count] = ar[i];
                ar[i] = 0;
                count =i;

            }
        }

    }
}
