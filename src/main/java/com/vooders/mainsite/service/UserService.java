package com.vooders.mainsite.service;

import com.vooders.mainsite.model.User;

public interface UserService {
    public User findUserByEmail(String email);
    public void saveUser(User user);
}
