package com.advanced.dsa.dataStructures.nonLinear.trees.problems.diameter;
public class Node {
    int data;
    Node left;
    Node right;
    static int diameter = 0;
    Node(int data){
        this.data = data;
        this.left = this.right = null;
    }
    public static int findHeight(Node root){
        if (root == null){
            return 0; // The height of an empty tree is Zero
        }
        int leftHeight = findHeight(root.left);
        int rightHeight = findHeight(root.right);
        diameter = Math.max(diameter, leftHeight + rightHeight); // Exclude
        // diameter = Math.max(diameter, leftHeight + rightHeight + 1); // Include

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.right = new Node(4);
        root.right.right.right = new Node(5);
        System.out.println("Height: " + findHeight(root));
        System.out.println("Diameter: " + diameter);
    }
}