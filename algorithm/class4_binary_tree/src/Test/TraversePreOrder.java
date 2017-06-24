package Test;

import Test.TreeNode;

/**
 * Created by xiangyuli on 3/21/17.
 */
public class TraversePreOrder {
    public void preOrder(TreeNode root) {
        //base case
        if (root == null) {
            return;
        }
        //recursive rule
        System.out.println(root.key);
        preOrder(root.left);
        preOrder(root.right);
    }
}
