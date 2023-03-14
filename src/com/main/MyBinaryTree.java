package com.main;

public class MyBinaryTree<K extends Comparable<K>>{
    private MyBinaryNode<K> root;

    //This method is used to add a new node with the given key to the binary tree.
    // The method recursively traverses the binary tree until it finds the right place to insert the new node.
    private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key){

        //If the 'current' node is null, it means that the binary tree is empty, and
        // we can simply create a new node with the given key and return it.
        if(current == null) {
            return new MyBinaryNode<K>(key);
        }

        //If the 'current' node is not null, we compare the given key with the key of
        // the current node using the compareTo() method
        int compareResult = key.compareTo(current.key);

        //If the keys are equal, we simply return the current node as the node with the
        // same key is already present in the tree.
        if(compareResult == 0)
            return current;

        //If the key is less than the key of the current node, we recursively call the addRecursively() method
        // with the left child of the current node and the same key value
        if(compareResult < 0)
            current.left = addRecursively(current.left, key);

        //If the key is greater than the key of the current node, we recursively call the addRecursively() method
            // with the right child of the current node and the same key value.
        else
            current.right = addRecursively(current.right, key);

        //the method now returns the updated 'current' node
        return current;
    }

    public void add(K key) {
        this.root = this.addRecursively(root, key);
    }

    //returns the number of nodes in the binary tree rooted at the current node current
    private int getSizeRecursively(MyBinaryNode<K> current) {

        // If the current node is null, then the size of the subtree is 0
        //Or else,the size is computed by adding 1 to the size of the left subtree and the size of the right subtree recursively.
        return current == null? 0: 1 + this.getSizeRecursively(current.left)
                                     + this.getSizeRecursively(current.right);
    }

    // returns the number of nodes in the binary tree by invoking the private
    // recursive helper method 'getSizeRecursively' on the root node.
    public int getSize() {
        return this.getSizeRecursively(root);
    }

    //prints the root node of the binary tree
    public void printBinaryTree() {
        System.out.println("My Tree: " + root);
    }

    //returns a string representation of the binary tree
    @Override
    public String toString() {
        return "MyBinaryTree{" + root + '}';
    }
}
