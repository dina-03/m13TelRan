package de.telran;

public class Main {

    public static void main(String[] args) {
        Node ten = new Node(null, null);
        Node nine = new Node(null, null); //9
        Node eight = new Node(nine, null); //8
        Node seven = new Node(null, ten); //7
        Node six = new Node(seven, eight); // 6
        Node five = new Node(null, six); // 5
        Node three = new Node(null, null); // 3
        Node one = new Node(null, null); // 1
        Node two = new Node(one, three); // 2
        Node root = new Node(two, five); // 4 root


        System.out.println("Height of tree is: " + root.getHeight(root));
        System.out.println("The number of the tree nodes: " + root.getVertexNumber(root));
    }
}
