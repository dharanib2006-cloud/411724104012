public class BinarySearchTree {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    Node root;

    public Node insert(Node root, int key) {

        if (root == null) {
            return new Node(key);
        }

        if (key < root.data) {
            root.left = insert(root.left, key);
        }

        else if (key > root.data) {
            root.right = insert(root.right, key);
        }

        return root;
    }


    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();


        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 70);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 60);
        tree.root = tree.insert(tree.root, 80);

        
    }
}
