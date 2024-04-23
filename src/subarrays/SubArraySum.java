package subarrays;

public class SubArraySum {
    public static void main(String[] args) {
        int[] ar = new int[]{1,2,3,4,5};
        int n = ar.length;
        printAllSubArraySum(ar,n);
    }

    private static void printAllSubArraySum(int[] ar, int n) {
        for(int i=0;i<n;i++){
            for(int j =i;j<n;j++){
                int s = 0;
                for(int k =i;k<=j;k++){
                    s+=ar[k];
                }
                System.out.print(s+" ");
            }
            System.out.println();
        }

    }
}
