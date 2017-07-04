package problem._463;

import java.util.Arrays;

public class Solution {
    /**
     * @param A an integer array
     * @return void
     */
    public void sortIntegers(int[] A) {

        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] > A[j]) {
                    int tmp = A[j];
                    A[j] = A[i];
                    A[i] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] A = new int[]{5, 1, 2, 4};
        new Solution().sortIntegers(A);
        System.out.println(Arrays.toString(A));
    }
}
