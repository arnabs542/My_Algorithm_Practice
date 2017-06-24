package Test;

import Test.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;


public class TraversePostOrderIteration {
    public List<Integer> traversePostOrderIteration(TreeNode root) {
        //corner case: null check
        if (root==null) {
            return  null;
        }

        //local variable
        List<Integer> result = new ArrayList<Integer>();
        Deque<TreeNode> stack =  new LinkedList<TreeNode>();
        TreeNode prev = null;
        stack.offerFirst(root);
        while (!stack.isEmpty()) {
            TreeNode current = stack.peekFirst();
            //if going down, go to left or right direction
            //first if: prev is the parent of current, current come from root, should go down
            if (prev==null || current==prev.left || current==prev.right) {
                if (current.left!=null) {
                    stack.offerFirst(current.left);
                } else if (current.right!=null) {
                    stack.offerFirst(current.right);
                } else {
                    result.add(current.key);
                    stack.pollFirst();
                }
                //traverse previous from a left subtree, left subtree finish traverse
            } else if (prev == current.left) {
                if (current.right != null) {
                    stack.offerFirst(current.right);
                } else {
                    result.add(current.key);
                    stack.pollFirst();
                }
                //traverse previous from a right subtree, right subtree finish traverse
            } else {
                result.add(current.key);
                stack.pollFirst();

            }
            prev = current;
        }
        return result;
    }
}
