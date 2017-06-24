package Test;

import Test.TreeNode;


public class IsBinaryTreeSymmetric {
    public boolean checkSymmetric (TreeNode root) {
        if (root==null) {return true;}
        return isBinaryTreeSymmetric(root.left, root.right);
    }


    private boolean isBinaryTreeSymmetric(TreeNode root1,TreeNode root2) {
        //base case
        if (root1==null && root2==null) {
            return true;
        } else if (root1==null || root2==null) {
            return false;
        } else if (root1.key != root2.key) {
            return false;
        }

        //recursive rule
        return isBinaryTreeSymmetric(root1.left,root2.right) && isBinaryTreeSymmetric(root1.right,root2.left);


    }
}
