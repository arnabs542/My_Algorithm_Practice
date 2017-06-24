package Test;

import Test.TreeNode;

/**
 * Created by xiangyuli on 3/22/17.
 */
public class IsBinarySearchTree {
    public boolean checkBST(TreeNode root) {
        if (root==null) {
            return true;
        }

        return isBinarySearchTree(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    public boolean isBinarySearchTree(TreeNode root,int min, int max) {
        //basecase
        if (root==null) {
            return true;
        }
        //recursive rule
        if (root.key <= min || root.key >= max) {
            return false;
        }
        return isBinarySearchTree(root.left,min,root.key) && isBinarySearchTree(root.right,root.key,max);
    }

}
