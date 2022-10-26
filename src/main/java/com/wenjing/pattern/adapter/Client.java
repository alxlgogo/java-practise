package com.wenjing.pattern.adapter;

public class Client {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        UserServiceAdapter userServiceAdapter = new UserServiceAdapterImpl(userService);
        String user = userServiceAdapter.findUserById(0);
        String users = userServiceAdapter.findUsers();
        System.out.println(user);
        System.out.println(users);
    }
}
