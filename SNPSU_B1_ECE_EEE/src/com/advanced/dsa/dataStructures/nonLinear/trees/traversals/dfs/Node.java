package com.advanced.dsa.dataStructures.nonLinear.trees.traversals.dfs;
public class Node {
    int data; // The data of the node
    Node left; // The address of the left child
    Node right; // The address of the right child
    Node(int data){
        this.data = data;
        this.left = this.right = null; // Node has no children initially
    }
    public static void preOrder(Node root){ // DLR
        if (root != null){
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public static void inOrder(Node root){ // LDR
        if (root != null){
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
    public static void postOrder(Node root){ // LRD
        if (root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }
    public static void main(String[] args) {
        // Construct the binary tree
        // We must construct the tree from
        // Top -> Bottom, Left -> Right, Level By Level
        // Level-0
        Node root = new Node(1);
        // Level-1
        root.left = new Node(2);
        root.right = new Node(3);
        // Level-2
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        // Level-3
        root.left.right.left = new Node(9);
        root.right.right.left = new Node(15);
        System.out.println("PreOrder Traversal");
        preOrder(root);
        System.out.println();
        System.out.println("InOrder Traversal");
        inOrder(root);
        System.out.println();
        System.out.println("PostOrder Traversal");
        postOrder(root);
        System.out.println();
    }
}
