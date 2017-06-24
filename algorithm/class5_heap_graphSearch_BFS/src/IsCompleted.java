/**
 * Created by xiangyuli on 3/26/17.
 */
import java.util.*;


public class IsCompleted {


    public boolean isComplete(TreeNode root) {
        if (root == null) { return true;}
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        boolean flag = false;
        while(!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            // for left subtree
            if (cur.left==null) { flag = true;}
            else if (flag) { return false;}
            else { queue.offer(cur.left); }

            // for right subtree
            if (cur.right==null) { flag = true;}
            else if (flag) { return false;}
            else { queue.offer(cur.right); }
        }
        return true;
    }
}
