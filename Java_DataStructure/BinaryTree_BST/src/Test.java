/**
 * Created by xiangyuli on 3/21/17.
 */
import java.util.*;

public class Test {
    public static void main(String[] args) {

    }
}

class TreeNode {
    public int key;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int key) {
        this.key = key;
    }

}

class GraphNode {
    public int key;
    List<GraphNode> neighbors;
    public GraphNode (int key) {
        this.key = key;
        neighbors = new ArrayList<GraphNode>();

    }
}