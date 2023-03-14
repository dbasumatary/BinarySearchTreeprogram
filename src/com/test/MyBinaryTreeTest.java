package com.test;

import com.main.MyBinaryTree;
import org.junit.Assert;
import org.junit.Test;

public class MyBinaryTreeTest {
    @Test
    public void given3NumbersWhenAddedToBinaryTreeShouldReturnSizeThree(){
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(34);
        myBinaryTree.add(21);
        int size = myBinaryTree.getSize();
        Assert.assertEquals(3,size);
    }
}
