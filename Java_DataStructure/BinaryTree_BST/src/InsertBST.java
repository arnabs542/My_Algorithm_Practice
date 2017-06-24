
public class InsertBST {
    public TreeNode insertBST(TreeNode root, int target) {
        TreeNode newNode = new TreeNode(target);
        if (root == null) {
            return newNode;
        }
        TreeNode curNode = root;
        while (curNode.key != target) {
            if (curNode.key > target) {
                if (curNode.left != null) {
                    curNode = curNode.left;
                } else {
                    curNode.left = newNode;
                    break;
                }
            } else {
                if (curNode.right != null) {
                    curNode = curNode.right;
                } else {
                    curNode.right = newNode;
                    break;
                }
            }
        }
        return root;
    }

    public TreeNode insertBSTRecursive(TreeNode root, int target) {
        if (root == null) {
            TreeNode newNode = new TreeNode(target);
            return newNode;
        }
        if (root.key < target) {
            root.right = insertBSTRecursive(root.right,target);
        } else if (root.key > target) {
            root.left = insertBSTRecursive(root.left,target);
        }
        return root;
    }


}
