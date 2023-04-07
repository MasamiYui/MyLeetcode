package me.bm;

import java.util.*;

public class BM41 {
    public int[] solve (int[] xianxu, int[] zhongxu) {
        TreeNode root = reConstructBinaryTree(xianxu, zhongxu);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        List<Integer> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                if (i == size - 1) {
                    result.add(poll.val);
                }
                if (poll.left != null) {
                    queue.add(poll.left);
                }
                if (poll.right != null) {
                    queue.add(poll.right);
                }
            }
        }
        int[] r = new int[result.size()];
        for(int i=0; i<r.length; i++){
            r[i] = result.get(i);
        }
        return r;


    }

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
