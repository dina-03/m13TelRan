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
    public void testGetHeight(){
        assertEquals(0,root.getHeight(nine));
        assertEquals(1,root.getHeight(two));
        assertEquals(0,root.getHeight(three));
        assertEquals(2,root.getHeight(six));
        assertEquals(1,root.getHeight(eight));
        assertEquals(4,root.getHeight(root));
        assertEquals(0,root.getHeight(one));
        assertEquals(0,root.getHeight(seven));
        assertEquals(3,root.getHeight(five));
    }

    @Test
    public void testGetVertexNumber(){
        assertEquals(1,root.getVertexNumber(nine));
        assertEquals(2,root.getVertexNumber(eight));
        assertEquals(1,root.getVertexNumber(seven));
        assertEquals(4,root.getVertexNumber(six));
        assertEquals(5,root.getVertexNumber(five));
        assertEquals(1,root.getVertexNumber(three));
        assertEquals(1,root.getVertexNumber(one));
        assertEquals(3,root.getVertexNumber(two));
        assertEquals(9,root.getVertexNumber(root));
    }

}