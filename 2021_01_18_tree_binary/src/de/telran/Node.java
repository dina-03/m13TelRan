package de.telran;

public class Node {
    Node left;
    Node right;

    public Node(Node left, Node right) {
        this.left = left;
        this.right = right;
    }

    public int getHeight(Node root) {
        if (root == null)
            return -1;
        else {
            int leftRib = getHeight(root.left);
            int rightRib = getHeight(root.right);

            if (leftRib > rightRib)
                return leftRib + 1;
            else
                return rightRib + 1;
        }
    }

    public int getVertexNumber(Node root) {
        if (root == null)
            return 0;
        else {
            int leftVertex = getVertexNumber(root.left);
            int rightVertex = getVertexNumber(root.right);
            return leftVertex + rightVertex + 1;
        }
    }
}
