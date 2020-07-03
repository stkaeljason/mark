package com.qiuqi.mark.common.algstru;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 7/2/20 4:40 PM
 */
public class ArrayStack<E> {

    private  Integer size;
    private E[] arr ;
    private Integer top;

    public ArrayStack(Integer size){
        this.size = size;
        arr = (E[])new Object[size];
        top = -1;
    }

    public Boolean isEmpty(){
        if(top.equals(-1)){
            return true;
        }
        return false;
    }

    public void push(E e){
        if(top.equals(size-1)){
            throw new RuntimeException("this stack is fulled");
        }
        top++;
        arr[top] = e;
    }

    public E pop(){
        if(isEmpty()){
            throw new RuntimeException("this stack is empty");
        }
        E e = arr[top];
        top--;
        return e;
    }

    public E getTopValue(){
        if(isEmpty()){
            throw new RuntimeException("this stack is empty");
        }
        E e = arr[top];
        return e;
    }

    public void show(){
        for(Integer i=top;i>=0;i--){
            System.out.println(arr[i]);
        }
    }

    public Integer getTop() {
        return top;
    }
}