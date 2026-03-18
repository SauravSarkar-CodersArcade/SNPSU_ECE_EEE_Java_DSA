package com.advanced.dsa.dataStructures.nonLinear.bst;

import com.sun.source.tree.Tree;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data = data;
        this.left = this.right = null;
    }
}
public class BinarySearchTree {
    public static void inOrder(TreeNode root){
        if (root != null){
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
    public static TreeNode insert(TreeNode root, int key){
        if (root == null){
            // the new node will become the root node
            return new TreeNode(key);
        }
        if (key < root.data){
            root.left = insert(root.left, key);
        } else if (key > root.data) {
            root.right = insert(root.right, key);
        }
        return root; // This is the only access to the tree
    }
    public static TreeNode search(TreeNode root, int key){
        // case 1 -> tree is empty
        // case 2 -> data of root is the key
        if (root == null || key == root.data){
            return root;
        }
        if (root.data < key){
            return search(root.right, key);
        }
        return search(root.left, key);
    }
    public static TreeNode findMin(TreeNode root){
        TreeNode curr = root;
        while (curr != null && curr.left != null){
            curr = curr.left;
        }
        return curr;
    }
    public static TreeNode delete(TreeNode root, int key){
        if (root == null){
            return root; // Can't delete the key, tree is empty
        }
        if (key > root.data){
            root.right = delete(root.right, key);
        } else if (key < root.data) {
            root.left = delete(root.left, key);
        }else {
            // We need to delete the root node itself
            // Case 1 -> Node with only 1 child (left or right)
            if (root.left == null){
                TreeNode temp = root.right;
                root = null;
                return temp;
            } else if (root.right == null) {
                TreeNode temp = root.left;
                root = null;
                return temp;
            }
            // Node with both the children (both left & right exist)
            // We need to find the (inorder successor)
            // It is the minimum value in the right subtree
            TreeNode temp = findMin(root.right);
            root.data = temp.data;
            root.right = delete(root.right, temp.data);
        }
        return root;
    }
    public static void main(String[] args) {
        TreeNode root = null;
        root = insert(root, 50);
        inOrder(root);
        System.out.println();
        int[] arr = {60,20,30,10,58,100};
        for (int i=0; i< arr.length; i++){
            root = insert(root, arr[i]);
        }
        inOrder(root);
        System.out.println();
        int key1 = 50;
        int key2 = 99;
        TreeNode res1 = search(root, key1);
        TreeNode res2 = search(root, key2);
        System.out.println(res1 != null ? "Present" : "Not Present");
        System.out.println(res2 != null ? "Present" : "Not Present");
        root = delete(root, 50);
        inOrder(root);
        System.out.println();
        System.out.println("New Root: " + root.data);
    }
}
