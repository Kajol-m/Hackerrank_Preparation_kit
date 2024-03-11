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

   public static void plusMinus(List<Integer> arr) {
    int pos = 0, neg = 0, zer = 0, n = arr.size();
    for (int i = 0; i < arr.size(); i++) {
        if (arr.get(i) > 0) {
            pos++;
        } else if (arr.get(i) < 0) {
            neg++;
        } else {
            zer++;
        }
    }
    System.out.printf("%8.6f\n", (double) pos / n);
    System.out.printf("%8.6f\n", (double) neg / n);
    System.out.printf("%8.6f\n", (double) zer / n);
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
