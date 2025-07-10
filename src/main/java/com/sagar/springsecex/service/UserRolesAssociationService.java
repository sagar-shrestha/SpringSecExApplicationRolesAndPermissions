package com.sagar.springsecex.service;

import com.sagar.springsecex.entity.UserRolesAssociation;

import java.util.List;

public interface UserRolesAssociationService {

    void saveUserRolesAssociation(UserRolesAssociation userRolesAssociation);

    List<UserRolesAssociation> getAllUserRolesAssociation();
}
