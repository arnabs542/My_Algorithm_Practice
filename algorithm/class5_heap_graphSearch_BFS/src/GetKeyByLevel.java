/**
 * Get the list of list of keys in a given binary tree layer by layer. Each layer is represented by a list of keys and the keys are traversed from left to right.
 Examples
 5
 /    \
 3        8
 /   \        \
 1     4        11
 the result is [ [5], [3, 8], [1, 4, 11] ]
 Corner Cases
 What if the binary tree is null? Return an empty list of list in this case.
 How is the binary tree represented?
 We use the level order traversal sequence with a special symbol "#" denoting the null node.
 For Example:
 The sequence [1, 2, 3, #, #, 4] represents the following binary tree:
 1
 /   \
 2     3
 /
 4

 */
import java.util.*;

public class GetKeyByLevel {
    public List<List<Integer>> getKeyByLevel(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null) {return result;}
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> curLayer = new ArrayList<Integer>();
            for (int i = 0;i < size; i++) {
                //a list store all value in this layer
                TreeNode cur = queue.poll();
                curLayer.add(cur.key);
                if (cur.left != null) {
                    queue.offer(cur.left);
                }
                if (cur.right != null) {
                    queue.offer(cur.right);
                }
            }
            result.add(curLayer);
        }
        return result;
    }
}
