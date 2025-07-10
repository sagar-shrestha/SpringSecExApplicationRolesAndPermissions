package com.sagar.springsecex.controller;

import com.sagar.springsecex.entity.Roles;
import com.sagar.springsecex.service.RolesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roles")
@RequiredArgsConstructor
public class RolesController {

    private final RolesService rolesService;

    @PostMapping
    public String save(@RequestBody Roles roles) {
        rolesService.createRole(roles);
        return "Roles saved successfully";
    }

    @GetMapping
    public List<Roles> findAll() {
        return rolesService.getAllRoles();
    }
}
