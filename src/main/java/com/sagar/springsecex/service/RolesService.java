package com.sagar.springsecex.service;

import com.sagar.springsecex.entity.Roles;

import java.util.List;

public interface RolesService {

    void createRole(Roles role);

    List<Roles> getAllRoles();
    Roles getRoleById(Integer id);
}
