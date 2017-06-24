package Test;

import Test.TreeNode;

/**
 * Created by xiangyuli on 3/22/17.
 */

public class IsTwikledIdentical {
    public boolean isTwikledIdentical(TreeNode root1, TreeNode root2) {
        //base case
        if (root1==null && root2==null) {
            return true;
        } else if (root1==null || root2==null) {
            return false;
        } else if (root1.key != root2.key) {
            return false;
        }

        //recursive rule
        return isTwikledIdentical(root1.left,root2.left) && isTwikledIdentical(root1.right,root2.right)
                ||  isTwikledIdentical(root1.left,root2.right) && isTwikledIdentical(root1.right,root2.left);
    }
}