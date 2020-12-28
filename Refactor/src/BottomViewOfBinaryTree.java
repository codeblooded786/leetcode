import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class TreeNode {
    int data;
    int hd;
    TreeNode left, right;

    public TreeNode(int data) {
        this.data = data;
        this.hd = Integer.MAX_VALUE;
        this.left = null;
        this.right = null;
    }
}

class BottomViewOfBinaryTree {

    TreeNode root;

    public BottomViewOfBinaryTree(TreeNode root) {
        this.root = root;
    }

    public void bottomView() {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        int hd = 0;
        root.hd = hd;
        queue.add(root);
        Map<Integer, Integer> matrix = new TreeMap<>();

        while (!queue.isEmpty()) {
            TreeNode tempNode = queue.poll();
            hd = tempNode.hd;
            matrix.put(hd, tempNode.data);

            if (tempNode.left != null) {
                tempNode.left.hd = hd - 1;
                queue.add(tempNode.left);
            }
            if (tempNode.right != null) {
                tempNode.right.hd = hd + 1;
                queue.add(tempNode.right);
            }
        }

        for (Map.Entry<Integer, Integer> entry : matrix.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(8);
        root.right = new TreeNode(22);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(25);
        root.left.right.left = new TreeNode(10);
        root.left.right.right = new TreeNode(14);
        BottomViewOfBinaryTree tree = new BottomViewOfBinaryTree(root);
        System.out.println("Bottom view of the given binary tree:");
        tree.bottomView();
    }


}
