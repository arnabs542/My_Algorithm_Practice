
public class SearchBST {
    public TreeNode searchBST(TreeNode root, int target) {
        TreeNode curNode = root;
        while (curNode != null && curNode.key != target) {
            if (target < curNode.key) {
                curNode = curNode.left;
            } else {
                curNode = curNode.right;
            }

        }
        //out of while loop condition: curNode == null || curNode.key = target
        return curNode;
    }

    public TreeNode searchBSTRecursive (TreeNode root, int target) {
        //basecase
        if (root == null || root.key == target) {
            return root;
        }
        //recursive rule
        if (target < root.key) {
           return searchBSTRecursive(root.left,target);//tail recursion, recursive call happens on the last exeution statement, this case can be easily transfer to iterative solution
        } else {
           return searchBSTRecursive(root.right,target);
        }
    }
}
