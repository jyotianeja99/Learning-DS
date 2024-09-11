package subarrays;

public class SubArraySum {
    public static void main(String[] args) {
        //int[] ar = new int[]{1,2,3,4,5,-10};
        //int n = ar.length;
        //printAllSubArraySum(ar,n);
        //System.out.println(maxSumSubAray(ar,n));
        //int[] a = new int[]{3, 7, 90, 20, 10, 50, 40};
        int[] a = new int[]{3, 7, 5, 20, -10, 0, 12};
        //int B = 2;
        //System.out.println(findMinAvg(a,B));
        System.out.println(findPrimalNumber(a,a.length));
        System.out.println((findMinMaxSum(a,a.length))); //should be -10+20


    }

    //print sum of elements of every subarray.
    private static void printAllSubArraySum(int[] ar, int n) {
        for(int i=0;i<n;i++){
            for(int j =i;j<n;j++){
                int s = 0;
                for(int k =i;k<=j;k++){ //[i,j] being a subarray.
                    s+=ar[k];
                }
                System.out.print(s+" ");
            }
            System.out.println();
        }

    }

    private static int maxSumSubAray(int[] ar, int n){
        //input array: [1,2,3,4,-10]
        int maxSum = Integer.MIN_VALUE;
        int sum =0;
        for(int i = 0;i<n;i++){
              sum+=ar[i];
            if(sum<ar[i]){
                sum = ar[i];
            }
            if(sum>maxSum)
                maxSum = sum;
        }
        return maxSum;
    }

    //to find min average of a subarray of given size B
    private static int findMinAvg(int[] ar, int B){
        double minAvg = Integer.MAX_VALUE;
        int len = ar.length;
        double avg =0;
        int index = -1;
        for(int i =0;i<=len-B;i++){
            int sum =0;
            for(int j=i;j<i+B;j++){
                sum+=ar[j];
            }
            avg = sum/B;
            if(avg<minAvg){
                minAvg = avg;
                index = i;

            }
        }
        return index;
    }

    private static int findPrimalNumber(int[] ar, int len){
        //primal number is the no of prime numbers in an array.
        int count =0;
        for(int i=0;i<len;i++){
            if(ar[i]<2){
                count++;
                continue;
            }
            for(int j=2;j<Math.sqrt(ar[i]);j++){
                if(ar[i]%j==0){
                    count++;
                    break;
                }
            }
        }
        return len-count;
    }

    private static int findMinMaxSum(int[] ar, int len){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i =0;i<len;i++){
            if(ar[i]<min){
                min = ar[i];
            }
            if(ar[i]>max){
                max = ar[i];
            }

        }
        return max+min;
    }

}
