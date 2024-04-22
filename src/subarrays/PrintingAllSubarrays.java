package subarrays;

public class PrintingAllSubarrays {
    public static void main(String[] args) {
        //int[] ar = new int[]{10,12,4,22,23,1,6,7,25,10};
        int[] ar = new int[]{1,2,3,4};
        printAllSubArrays(ar);
    }

    public static void printAllSubArrays(int[] ar){
        int n = ar.length;
        for(int i=0;i<n;i++){
            for(int j = 0;j<n;j++){
                for(int k =i;k<=j;k++){
                    System.out.print(ar[k]+ " ");
                }
                System.out.println();

            }
            //System.out.println();
        }

    }
}
