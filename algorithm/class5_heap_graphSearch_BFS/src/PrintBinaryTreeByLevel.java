
import java.util.*;

public class PrintBinaryTreeByLevel {
    public void printBFS(TreeNode root) {
        if (root == null) { return; }
        Queue<TreeNode> q = new ArrayDeque<TreeNode>();
        q.offer(root);
        //while loop: decide if the level is printed
        while(!q.isEmpty()) {
            //expand ndoe, have to store the size of queue for each level
            int size = q.size();
            for (int i=0;i<size;i++) {
                TreeNode n = q.remove();
                if (n.left!=null) {q.offer(n.left);}
                if (n.right!=null) {q.offer(n.right);}
                System.out.println(n.key);
            }
            System.out.println();
        }
    }
}

