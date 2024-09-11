package arrays;

import java.util.ArrayList;
import java.util.List;

public class EvenDigitNumbers {
    public static void main(String[] args) {
        int[] arr = {};
        List<Integer> evenDigitNums = getEvenDigitNums(arr);

    }

    private static List<Integer> getEvenDigitNums(int[] arr) {
        List<Integer> evenDigitNums = new ArrayList<Integer>();
        for(int num : arr){
            if(Integer.toString(Math.abs(num)).length()%2 == 0){
                evenDigitNums.add(num);
            }
        }
        return evenDigitNums;
    }
}
