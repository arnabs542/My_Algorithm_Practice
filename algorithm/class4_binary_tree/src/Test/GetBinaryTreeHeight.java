package Test;

import Test.TreeNode;

public class GetBinaryTreeHeight {


        public int getBinaryTreeHeight(TreeNode root) {
            //basecase
            if (root == null) {
                return 0;
            }
            //recursive rule
            return 1+ Math.max(getBinaryTreeHeight(root.left),getBinaryTreeHeight(root.right));

        }

}

/*
* Complexity analysis
* Time = O(n)
* Space = O(height)
*
*
* */



