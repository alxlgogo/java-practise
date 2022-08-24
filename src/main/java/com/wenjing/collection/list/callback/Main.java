package com.wenjing.collection.list.callback;

public class Main {
    public static void main(String[] args) throws Exception {
        Person person = new Person();
        System.out.println("Ready for working");
        Thread.sleep(2000);
        person.call(() -> {
            System.out.println("Working");
        });
    }
}
