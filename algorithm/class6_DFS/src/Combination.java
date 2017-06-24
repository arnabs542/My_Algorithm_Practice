/**
 * Created by xiangyuli on 4/6/17.
 */
public class Combination {
    public void combination(int money_left, int[] coins, int level, int[] sol) {
        if (level == coins.length - 1) {
            sol[level] = money_left;
            for (int j = 0; j < 4; j++) {
                System.out.print(sol[j] + " ");
            }
            System.out.println();
            return;
        }
        //money value on this level = coins[level]
        int max_branches = money_left / coins[level];
        for (int i = 0; i <= max_branches; i++) {
            sol[level] = i;
            combination(money_left - i * coins[level], coins, level + 1, sol);
        }
    }
}
