/**
 * Created by xiangyuli on 4/13/17.
 */
public class MinJump {
    public int minJump(int[] array) {
        //null and empty check
        if (array == null || array.length == 0) {
            return 0;
        }
        int n = array.length;
        int[] minJump = new int[n];
        minJump[n - 1] = 0;
        for (int i = n - 2; i >= 0; i--) {
            minJump[i] = -1;
            for (int j = i + 1; j < n; j++) {
                if (i + array[i] >= j && minJump[j] != -1) {
                    if (minJump[i] == -1 || minJump[i] > minJump[j] + 1) {
                        minJump[i] = minJump[j] + 1;
                    }

                }
            }
        }
        return minJump[0];
    }
}
