package com.main;

public class MyBinaryNode <K extends Comparable<K>>{
    K key;
    MyBinaryNode<K> left;
    MyBinaryNode<K> right;

    public MyBinaryNode(K key){
        this.key = key;
        this.left = null;
        this.right = null;
    }

    //returns a string representation of the binary tree.
    @Override
    public String toString() {
        StringBuilder myNodeString = new StringBuilder();
        myNodeString.append(key);

        if(left != null) {
            myNodeString.append(" -> ").append(left);
        }
        if(right != null) {
            myNodeString.append(" -> ").append(right);
        }
        return myNodeString.toString();
    }
}
