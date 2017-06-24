
public class DeleteBST {
    public TreeNode deleteBST (TreeNode root, int target) {
        if (root == null) {
            return null;
        }
        //step one: find the target node
        if (root.key > target) {
            root.left = deleteBST(root.left,target);
            return root;
        } else if (root.key < target) {
            root.right = deleteBST(root.right,target);
            return root;
        }

        //guarantee root!=null && root.val == target
        if (root.left == null) {
            return root.right;
        } else if (root.right == null) {
            return root.left;
        }

        //guarantee root.left !=null && root.right != null
        //case 4.1
        if (root.right.left == null) {
            root.right.left = root.left;
            return root.right;
        }

        //case 4.2
        //1. find and delete smallest node in root.right
        TreeNode smallest = deleteSmallest(root.right);
        //2. connect the smallest node with root.left and root.right
        smallest.left = root.left;
        smallest.right = root.right;
        return smallest;
    }

        private TreeNode deleteSmallest(TreeNode current) {
            TreeNode prev = current;
            current = current.left;
            while (current.left != null) {
                prev = current;
                current = current.left;
            }
            prev.left = prev.left.right;
            return current;
        }


}
