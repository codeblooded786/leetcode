public class CheckBST {

    static class Node {
        int data;
        Node left, right;
    }

    ;

    static Node newNode(int data) {
        Node node = new Node();
        node.data = data;
        node.left = node.right = null;
        return (node);
    }

    public static boolean isBST(Node root, Node left, Node right) {
        if (root == null)
            return true;

        if (left != null && left.data >= root.data)
            return false;

        if (right != null && right.data <= root.data) {
            return false;
        }
        return isBST(root.left, left, root) && isBST(root.right, root, right);
    }

    public static void main(String[] args) {

        Node root = newNode(3);
        root.left = newNode(2);
        root.right = newNode(5);
        root.left.left = newNode(1);
        root.left.right = newNode(4);

        System.out.println(isBST(root, null, null));

    }
}
