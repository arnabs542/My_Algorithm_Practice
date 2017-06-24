package Test;

import Test.TreeNode;

import java.util.ArrayList;
import java.util.List;



public class BSTGetRange {
    public List<Integer> bstGetRange(TreeNode root, int min, int max) {
        List<Integer> result = new ArrayList<Integer>();
        getRange(root, result, min, max);
        return result;
    }

    private void getRange(TreeNode root, List<Integer> result, int min, int max) {
        if (root == null) { return; }

        if (root.key > min) {
            getRange(root.left,result,min,max);
        }

        if (root.key >= min && root.key <= max) {
            result.add(root.key);
        }

        if (root.key < max) {
            getRange(root.right,result,min,max);
        }

    }

}

