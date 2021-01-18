package de.telran;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    Node nine = new Node(null, null); //9
    Node eight = new Node(nine, null); //8
    Node seven = new Node(null, null); //7
    Node six = new Node(seven, eight); // 6
    Node five = new Node(null, six); // 5
    Node three = new Node(null, null); // 3
    Node one = new Node(null, null); // 1
    Node two = new Node(one, three); // 2
    Node root = new Node(two, five); // 4 root

    @Test
    public void test(){

    }

}