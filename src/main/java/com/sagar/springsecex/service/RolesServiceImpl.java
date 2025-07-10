package com.sagar.springsecex.service;

import com.sagar.springsecex.entity.Roles;
import com.sagar.springsecex.repository.RolesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RolesServiceImpl implements RolesService {

    private final RolesRepository rolesRepository;

    @Override
    public void createRole(Roles role) {
        rolesRepository.save(role);
    }
}
