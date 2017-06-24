package Test;

import Test.TreeNode;

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
