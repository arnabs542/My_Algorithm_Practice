
public class MaxProductCutRope {
    public int maxProduct(int length) {
        if (length == 0) {
            return 0;
        }
        int[] M = new int[length + 1];
        M[0] = 0;
        M[1] = 0;
        for (int i = 0; i <= length; i++) {
            int curMax = 0;
            for (int j = 1; j < i; j++) {
                curMax = Math.max(curMax, Math.max(j, M[j]) * (i - j));
            }
            M[i] = curMax;
        }
        return M[length];
    }
}
