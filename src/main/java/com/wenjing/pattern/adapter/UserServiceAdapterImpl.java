package com.wenjing.pattern.adapter;

import com.google.gson.Gson;

import java.util.List;
import java.util.Map;

public class UserServiceAdapterImpl implements UserServiceAdapter {
    private UserService userService;

    public UserServiceAdapterImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public String findUserById(int id) {
        Map user = userService.findUserById(0);
        Gson gson = new Gson();
        String jsonUser = gson.toJson(user);
        return jsonUser;
    }

    @Override
    public String findUsers() {
        List<Map> users = userService.findUsers();
        String jsonUsers = new Gson().toJson(users);
        return jsonUsers;
    }
}
