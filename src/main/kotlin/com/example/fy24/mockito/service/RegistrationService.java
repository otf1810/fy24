package com.example.fy24.mockito.service;


import com.example.fy24.mockito.entity.User;

public interface RegistrationService {
    User register(String name, String phone) throws Exception;
}
