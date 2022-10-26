package com.wenjing.pattern.adapter;

import java.util.List;
import java.util.Map;

public interface UserService {
    Map findUserById(int userId);

    List<Map> findUsers();

}
