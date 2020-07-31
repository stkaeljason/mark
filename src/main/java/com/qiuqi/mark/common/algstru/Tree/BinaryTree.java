package com.qiuqi.mark.common.algstru.Tree;

import lombok.Getter;
import lombok.Setter;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 7/27/20 9:45 AM
 */
public class BinaryTree {
    private Node parent;

    public BinaryTree(Node node){
        parent = node;
    }

    public static void main(String[] args) {
        Node zhouyun = new Node(1, "zhouyun");
        Node monika = new Node(2,"monika");
        Node shaladuowa = new Node(3,"shaladuowa");
        Node gaijaerduo = new Node(4,"gaijaerduo");
        Node liutaiyang = new Node(5,"liutaiyang");
        zhouyun.setLeft(monika);
        zhouyun.setRight(shaladuowa);
        shaladuowa.setRight(gaijaerduo);
        gaijaerduo.setRight(liutaiyang);

        BinaryTree binaryTree = new BinaryTree(zhouyun);
        //every
        binaryTree.preTraversal(zhouyun);
//        binaryTree.midTraversal(zhouyun);
//        binaryTree.postTraversal(zhouyun);
        //query
//        Node node = binaryTree.proTraQueryTwo(10);
//        if(node == null){
//            System.out.println("not found");
//        }else {
//            System.out.println("found:"+node.toString());
//        }
        binaryTree.delNode(3);
        System.out.println("after delnode");
        binaryTree.preTraversal(zhouyun);

    }

    public void preTraversal(Node node){
        node.preTraversal();
    }

    public void midTraversal(Node node){
        node.midTraversal();
    }

    public void postTraversal(Node node){
        node.postTraversal();
    }

    public Node proTraQuery(int id){
        return parent.proTraQuery(id);
    }

    public Node proTraQueryTwo(int id){
        return parent.proTraQueryTwo(id);
    }

    public void  delNode(int id){
        if(parent.getId() == id){
            parent.setLeft(null);
            parent.setRight(null);
        }else {
            parent.delNode(id);
        }
    }
}

@Getter
@Setter
class Node{
    private int id;
    private String name;
    private Node left;
    private  Node right;

    public Node(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void preTraversal(){
        System.out.print(this.toString());
        if(this.left != null){
            this.left.preTraversal();
        }
        if(this.right !=null){
            this.right.preTraversal();
        }
    }

    public void midTraversal(){
        if(this.left != null){
            this.left.midTraversal();
        }
        System.out.print(this.toString());
        if(this.right !=null){
            this.right.midTraversal();
        }
    }

    public void postTraversal(){
        if(this.left != null){
            this.left.postTraversal();
        }
        if(this.right !=null){
            this.right.postTraversal();
        }
        System.out.print(this.toString());
    }

    public Node proTraQuery(int id){
        //完全二叉树查找，完全二叉树：左边小于右边
        Node node = null;
        if(this.id == id){
            return this;
        }
        if(this.left != null && id < this.id){
            node = this.left.proTraQuery(id);
        }else if (this.right != null && id > this.id){
            node = this.right.proTraQuery(id);
        }
        return node;
    }

    public Node proTraQueryTwo(int id){
        //完全二叉树查找，完全二叉树：左边小于右边
        if(this.id == id){
            return this;
        }
        Node node = null;

        if(this.left != null ){
            node = this.left.proTraQuery(id);
        }

        if(node!=null){
            return node;
        }

        if (this.right != null){
            node = this.right.proTraQuery(id);
        }
        return node;
    }

    public void delNode(int id){
        if(this.left != null && this.left.id == id){
            this.left = null;
            return;
        }

        if(this.right != null && this.right.id == id){
            this.right = null;
            return;
        }

        if(this.left != null ){
            this.left.delNode(id);
        }

        if(this.right !=null){
            this.right.delNode(id);
        }
    }

    public String toString(){
        return String.format("Node:%d_%s%n",this.id, this.name);
    }
}
