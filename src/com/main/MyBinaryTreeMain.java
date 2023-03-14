package com.main;

public class MyBinaryTreeMain {
    public static void main(String[] args) {
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        myBinaryTree.add(22);
        myBinaryTree.add(40);
        myBinaryTree.add(11);
        myBinaryTree.add(3);
        myBinaryTree.add(16);
        myBinaryTree.add(60);
        myBinaryTree.add(95);
        myBinaryTree.add(65);
        myBinaryTree.add(63);
        myBinaryTree.add(67);

        myBinaryTree.printBinaryTree();

        System.out.println();
        System.out.println("The size of the Binary Search Tree is : " + myBinaryTree.getSize());
        System.out.println("Is 63 present in the Binary Search Tree? " + myBinaryTree.searchTree(63));

    }
}