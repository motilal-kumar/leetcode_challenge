package com.leetcode.datastructure_coding;

import java.util.ArrayDeque;
import java.util.Deque;

public class InvertBinaryTree {



    public static void main(String[] args)
    {


        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        invertBinaryTreeTest(root);
        preorder(root);
    }



    public static void invertBinaryTreeTest(Node root) {

        if (root == null) {
            return;
        }

        Deque<Node> stack = new ArrayDeque<>();
        stack.add(root);


        while (!stack.isEmpty()) {

            Node current = stack.pollLast();


            swap(current);

            if (current.right != null) {
                stack.add(current.right);
            }

            if (current.left != null) {
                stack.add(current.left);
            }
        }

    }
    public static void swap(Node root) {
        if (root == null) {
            return;
        }

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }


     /*Tree to be construct.
     Given the root of a binary tree, invert the tree, and return its root.
                  1
                /   \
               /     \
              2       3
             / \     / \
            4   5   6   7
        */


}
