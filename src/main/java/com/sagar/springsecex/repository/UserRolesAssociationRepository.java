package com.sagar.springsecex.repository;

import com.sagar.springsecex.entity.UserRolesAssociation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRolesAssociationRepository extends JpaRepository<UserRolesAssociation, Long> {
}
