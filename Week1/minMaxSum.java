import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    long minSum = Long.MAX_VALUE;
    long maxSum = Long.MIN_VALUE;
    int n = arr.size();

    for (int i = 0; i < n; i++) {
        long sum = 0;
        for (int j = 0; j < n; j++) {
            if (i != j) {
                sum += arr.get(j);
            }
        }
        minSum = Math.min(minSum, sum);
        maxSum = Math.max(maxSum, sum);
    }

    System.out.println(minSum + " " + maxSum);
}

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
