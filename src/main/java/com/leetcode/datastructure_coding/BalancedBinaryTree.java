package com.leetcode.datastructure_coding;

public class BalancedBinaryTree {

    public static void main(String args[])
    {
        Node r = new Node(20);     //r=root.
        r.left = new Node(15);
        r.right = new Node(40);
        r.right.left = new Node(25);
        r.right.right = new Node(30);

        if (isBalanced(r) > 0)
            System.out.print("This is a Balanced.");
        else
            System.out.print("This is Not  a Balanced");
    }

    public static int isBalanced(Node r) {

        if (r == null)
            return 0;

        int LEFT_HEIGHT = isBalanced(r.left);

        if (LEFT_HEIGHT == -1)
            return -1;

        int RIGHT_HEIGHT = isBalanced(r.right);

        if (RIGHT_HEIGHT == -1)
            return -1;

        if (Math.abs(LEFT_HEIGHT - RIGHT_HEIGHT) > 1)
            return -1;
        else
            return Math.max(LEFT_HEIGHT, RIGHT_HEIGHT) + 1;
    }
}
