package com.wenjing.collection.list.callback;

public interface CallBack {
    public void doSth();
    public default void haha(){
        System.out.println("This is default method");
    }
}
