package com.sagar.springsecex.service;

import com.sagar.springsecex.security.entity.Audit;

public interface UsersService {

    Audit saveUsers(Audit users);

    String verify(Audit users);

    Audit getUsersById(Integer id);
}
