package com.qiuqi.mark.common.algstru;


/**
 * @author jiaqiying
 * @version 1.0
 * @date 6/23/20 3:12 PM
 */

public class hashmap<K, V> {
    private LinkedList<V> [] arr;

    private Integer size;

    public hashmap(int size){
        size = size;
        arr = new LinkedList[size];
        for(int i=0;i<size;i++){
            arr[i] = new LinkedList<>();
        }
    }

    public void add(int id, V v){
        Integer hashValue = hash(id);
        arr[hashValue].add(v);
    }

    public Integer hash(int id){
        return id%size;
    }
}

class Staff {
    private String id;
    private String name;
    public String toString(){
        return name;
    }
}

class Node<V> {
    private V value;
    private Node<V> next;

    public Node(){
        value = null;
        next = null;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public V getValue() {
        return value;
    }

    public void setNext(Node<V> next) {
        this.next = next;
    }

    public Node<V> getNext() {
        return next;
    }

    public String toString(){
        return "Node:"+value.toString();
    }
}

class LinkedList<V>{

    private Node<V> head = new Node<>();

    public void add(V v) {
        Node<V> node = new Node<>();
        Node<V> temp = head;

        while (true){
            if(temp.getNext() == null){
                node.setValue(v);
                head.setNext(null);
                temp.setNext(node);
                break;
            }
            temp = temp.getNext();

        }
    }

    public void list() {
        Node<V> temp = head;

        while (true){
            System.out.println(temp.toString());
            if(temp.getNext() == null){
                break;
            }
            temp = temp.getNext();
        }
    }
}
