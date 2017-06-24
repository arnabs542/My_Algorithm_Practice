import java.util.*;

public class Test {
    public static void main(String[] args) {

        //test complete tree
        TreeNode root = new TreeNode(1);
        TreeNode l1left = new TreeNode(3);
        TreeNode l1right = new TreeNode(2);
        TreeNode l21 = new TreeNode(5);
        TreeNode l22 = new TreeNode(4);
        TreeNode l23 = new TreeNode(7);
        TreeNode l24 = new TreeNode(9);
        TreeNode l31 = new TreeNode(9);
        TreeNode l32 = new TreeNode(11);

        root.left = l1left;
        root.right = l1right;
        l1left.left = l21;
        l1left.right = l22;
        l1right.left = l23;
        l1right.right = l24;
        l21.left = l31;
        l21.right = l32;

//        PrintBinaryTreeByLevel solution1 = new PrintBinaryTreeByLevel();
//        solution1.printBFS(root);
//        IsCompleted solution = new IsCompleted();
//        System.out.println(solution.isComplete(root));

        GetKeyByLevel solution = new GetKeyByLevel();
        List<List<Integer>> result = solution.getKeyByLevel(root);
        System.out.println(result);




    }
}

class TreeNode {
    int key;
    TreeNode left;
    TreeNode right;
    //constructor
    public TreeNode(int key) {
        this.key = key;
    }
}

class GraphNode {
    int key;
    List<GraphNode> neighbors;
    public GraphNode(int key) {
        this.key = key;
        neighbors = new ArrayList<GraphNode>();
    }

}