package com.wenjing.pattern.adapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserServiceImpl implements UserService {
    @Override
    public Map findUserById(int userId) {
        Map user = new HashMap();
        user.put(1, "TOM");
        return user;
    }

    @Override
    public List<Map> findUsers() {
        List<Map> userList = new ArrayList<>();
        Map user1 = new HashMap();
        user1.put(1, "TOM");
        Map user2 = new HashMap();
        user2.put(2, "Jerry");
        userList.add(user1);
        userList.add(user2);
        return userList;
    }
}
