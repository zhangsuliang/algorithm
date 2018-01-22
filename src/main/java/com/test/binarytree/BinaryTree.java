package com.test.binarytree;

import java.util.Arrays;
import java.util.List;

public class BinaryTree {
    /**
     * 创建二叉树
     * @param datas 数组
     * @param nodes Node集合
     */
    private void createBinaryTree(int[] datas, List<Node> nodes){
        //将数组中值给list
        for (int data: datas){
            Node node=new Node(data);
            nodes.add(node);
        }
        //设置各节点的左右节点
        Iterables.forEach(nodes,(index,node)->{
            node.setLeft(nodes.get(index*2+1));
            node.setRight(nodes.get(index*2+2));
        });
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "b", "c", "c", "c", "d", "d", "d", "f", "f", "g");
        Iterables.forEach(list, (index, str) -> System.out.println(index + " -> " + str));
    }
}
