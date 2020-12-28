import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class LevelOrderBinaryTreeTraversal {

    Node root;

    public LevelOrderBinaryTreeTraversal() {
        this.root = null;
    }

    private void printLevelOrder() {
        Queue<Node> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);

        while (!nodeQueue.isEmpty()) {
            Node tempNode = nodeQueue.poll();
            System.out.println(tempNode.data);

            if (tempNode.left != null) {
                nodeQueue.add(tempNode.left);
            }
            if (tempNode.right != null) {
                nodeQueue.add(tempNode.right);
            }
        }
    }

    private void printLeftView() {
        Queue<Node> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);

        while (!nodeQueue.isEmpty()) {
            int n = nodeQueue.size();
            for (int i = 1; i <= n; i++) {

                Node tempNode = nodeQueue.poll();

                if (i == 1) {
                    System.out.println(tempNode.data);
                }

                if (tempNode.left != null) {
                    nodeQueue.add(tempNode.left);
                }

                if (tempNode.right != null) {
                    nodeQueue.add(tempNode.right);
                }
            }
        }
    }

    private void printRightView() {
        Queue<Node> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);

        while (!nodeQueue.isEmpty()) {
            int n = nodeQueue.size();
            for (int i = 1; i <= n; i++) {

                Node tempNode = nodeQueue.poll();

                if (i == n) {
                    System.out.println(tempNode.data);
                }

                if (tempNode.left != null) {
                    nodeQueue.add(tempNode.left);
                }

                if (tempNode.right != null) {
                    nodeQueue.add(tempNode.right);
                }
            }
        }
    }

    public static void main(String args[]) {
        /* creating a binary tree and entering
         the nodes */
        LevelOrderBinaryTreeTraversal tree_level = new LevelOrderBinaryTreeTraversal();
        tree_level.root = new Node(1);
        tree_level.root.left = new Node(2);
        tree_level.root.right = new Node(3);
        tree_level.root.left.left = new Node(4);
        tree_level.root.left.right = new Node(5);

        // tree_level.printLevelOrder();
        //  tree_level.printLeftView();
        tree_level.printRightView();

    }
}
