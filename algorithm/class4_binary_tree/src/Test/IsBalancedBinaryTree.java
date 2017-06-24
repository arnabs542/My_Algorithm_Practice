package Test;

import Test.TreeNode;

/**
 * Created by xiangyuli on 3/21/17.
 */


public class IsBalancedBinaryTree {
    public boolean isBalancedBinaryTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        int leftHeight = getBinaryTreeHeight(root.left);
        int rightHeight = getBinaryTreeHeight(root.right);

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }

        return isBalancedBinaryTree(root.left) && isBalancedBinaryTree(root.right);

    }

    private int getBinaryTreeHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        //recursive rule
        return 1 + (Math.max(getBinaryTreeHeight(root.left), getBinaryTreeHeight(root.right)));
    }
}