package Test; 

import Test.TreeNode;

import java.util.*;

public class TraverseInOrderIterate {
    public List<Integer> traverseInorderIterate(TreeNode root) {
        if (root == null) {
            return null;
        }
        List<Integer> result = new ArrayList<Integer>();
        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
//            if (cur != null) {
//                stack.offerFirst(cur);i
//                cur = cur.left;
//            } else {
//                cur = stack.pollFirst();
//                result.add(cur.key);
//                cur = cur.right;
//            }
            while (cur != null) {
                stack.offerFirst(cur);
                cur = cur.left;
            }
            cur = stack.pollFirst();
            result.add(cur.key);
            cur = cur.right;
        }
        return result;

    }

}


