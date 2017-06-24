package Test;

import Test.TreeNode;

import java.util.*;


/**
 * Created by xiangyuli on 3/21/17.
 */
public class TraversePreOrderIterate {

    public List<Integer> traversePreOrderIterate(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if (root == null) {
            return result;
        }
        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        stack.offerFirst(root);
        while (!stack.isEmpty()) {
            TreeNode cur = stack.pollFirst();
            //print the left node fist, so the left node should offer after right node
            if (cur.right != null) {
                stack.offerFirst(cur.right);
            }
            if (cur.left != null) {
                stack.offerFirst(cur.left);
            }
            result.add(cur.key);
        }
        return result;
    }

}
