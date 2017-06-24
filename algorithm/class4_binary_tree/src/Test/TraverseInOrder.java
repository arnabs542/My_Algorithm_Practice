package Test;

import Test.TreeNode;


public class TraverseInOrder {
    public void inOrder(TreeNode root) {
        //base case
        if (root == null) {
            return;
        }
        //recursive rule
        inOrder(root.left);
        System.out.println(root.key);
        inOrder(root.right);
    }


}


