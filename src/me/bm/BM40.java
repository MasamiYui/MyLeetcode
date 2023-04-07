package me.bm;

import java.util.Arrays;

public class BM40 {
    public TreeNode reConstructBinaryTree(int [] pre, int [] vin) {
        if (pre == null || pre.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(pre[0]);
        int index = findRootIndexInOrder(pre, vin);
        root.left = reConstructBinaryTree(
                Arrays.copyOfRange(pre, 1, index + 1),
                Arrays.copyOfRange(vin, 0, index)
        );
        root.right = reConstructBinaryTree(
                Arrays.copyOfRange(pre, index + 1, pre.length),
                Arrays.copyOfRange(vin, index + 1, vin.length)
        );

        return root;
    }

    public int findRootIndexInOrder(int[] pre, int[] vin) {
        for (int i = 0; i < vin.length; i++) {
            if (pre[0] == vin[i]) {
                return i;
            }
        }
        return 0;
    }
}
