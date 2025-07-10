package com.sagar.springsecex.service;

import com.sagar.springsecex.entity.Roles;
import com.sagar.springsecex.repository.RolesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RolesServiceImpl implements RolesService {

    private final RolesRepository rolesRepository;

    @Override
    public void createRole(Roles role) {
        rolesRepository.save(role);
    }

    @Override
    public List<Roles> getAllRoles() {
        return rolesRepository.findAll();
    }

    @Override
    public Roles getRoleById(Integer id) {
        return rolesRepository.getReferenceById(id);
    }
}
