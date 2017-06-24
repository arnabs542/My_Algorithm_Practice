package Test;

import Test.TreeNode;


public class TraversePostOrder {
    public void postOrder(TreeNode root) {
        //base case
        if (root == null) {
            return;
        }
        //recursive rule
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.key);
    }
}
