package com.example.fy24.mockito.dao;


import com.example.fy24.mockito.entity.User;

import java.sql.SQLException;

/**
 * @author echo
 * @version 1.0
 * @date 2022/3/28 15:51
 */
public class UserDao {

    public User save(String name, String phone, String repId) throws SQLException {
        return new User(name, phone, repId);
    }
}
