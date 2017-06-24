package Test;

//   10
// 5  15
//2 7  12 20

public class Test {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        TreeNode level2a = root.left = new TreeNode(5);
        TreeNode level2b = root.right = new TreeNode(15);
        TreeNode level3a = level2a.left = new TreeNode(2);
        TreeNode level3b = level2a.right = new TreeNode(7);
        TreeNode level3c = level2b.left = new TreeNode(12);
        TreeNode level3d = level2b.right = new TreeNode(20);

//        Test.TraversePreOrder solution_preOrder = new Test.TraversePreOrder();
//        solution_preOrder.preOrder(root);

//        Test.TraverseInOrder solution_inOrder = new Test.TraverseInOrder();
//        solution_inOrder.inOrder(root);

//        Test.TraversePostOrder solution_postOrder = new Test.TraversePostOrder();
//        solution_postOrder.postOrder(root);

//        Test.TraverseInOrderIterate solution = new Test.TraverseInOrderIterate();
//        List<Integer> result = solution.inOrderTraverseBT(root);
//        for (int i=0;i<result.size();i++) {
//         System.out.println(result.get(i));
//        }


//        Test.TraversePreOrderIterate solution = new Test.TraversePreOrderIterate();
//        List<Integer> result = solution.preOrderTraverseBT(root);
//        for (int i=0;i<result.size();i++) {
//            System.out.println(result.get(i));
//        }

//        Test.TraversePostOrderIteration solution = new Test.TraversePostOrderIteration();
//        List<Integer> result = solution.postOrderTraverseBT(root);
//        for (int i=0;i<result.size();i++) {
//            System.out.println(result.get(i));
//        }

//        Test.GetBinaryTreeHeight solution = new Test.GetBinaryTreeHeight();
//        int result = solution.getBinaryTreeHeight(root);
//        System.out.println(result);


//        Test.IsBalancedBinaryTree solution = new Test.IsBalancedBinaryTree();
//        boolean result = solution.isBalancedBinaryTree(root);
//        System.out.println(result);

//        Test.BSTGetRange solution = new Test.BSTGetRange();
//        int min = 4;
//        int max = 15;
//        List<Integer> result = solution.bstGetRange(root,min,max);
//        System.out.println(result);
//
//        Test.TraverseInOrderIterate solution = new Test.TraverseInOrderIterate();
//        List<Integer> result = solution.traverseInorderIterate(root);
//        for (int i = 0; i<result.size();i++) {
//            System.out.println(result.get(i));
//        }


    }

}



class TreeNode {
    public int key;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int value) {
        this.key = value;
        this.left = null;
        this.right = null;
    }

}



