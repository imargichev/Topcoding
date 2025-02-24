package org.example.BinarySearch;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class CountCompleteTreeNodes {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(3), new TreeNode(4));
    }

    public static int countNodes(TreeNode root) {
        if (root == null) return 0;

        int height = getHeight(root);

        if (height == 0) return 1; // Ако има само root, връщаме 1

        // 2. Бинарно търсене върху последното ниво
        int left = 0, right = (1 << height) - 1; // Индекси за възлите на последното ниво
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (exists(mid, height, root)) {
                left = mid + 1; // Ако съществува, търсим вдясно
            } else {
                right = mid - 1; // Ако не съществува, търсим вляво
            }
        }

        // 3. Общ брой възли = възлите в напълно запълнените нива + възлите на последното ниво
        return (1 << height) - 1 + left;
    }

    private static int getHeight(TreeNode node) {
        int height = 0;
        while (node.left != null) {
            height++;
            node = node.left;
        }
        return height;
    }

    // Проверява дали възел с индекс `index` съществува на последното ниво
    private static boolean exists(int index, int height, TreeNode node) {
        int left = 0, right = (1 << height) - 1; // Индекси на възлите в последното ниво
        for (int i = 0; i < height; i++) {
            int mid = left + (right - left) / 2;
            if (index <= mid) {
                node = node.left;
                right = mid;
            } else {
                node = node.right;
                left = mid + 1;
            }
        }
        return node != null;
    }
}