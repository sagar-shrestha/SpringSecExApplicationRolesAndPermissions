package com.sagar.springsecex.controller;

import com.sagar.springsecex.entity.Roles;
import com.sagar.springsecex.service.RolesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RolesController {

    private final RolesService rolesService;

    @PostMapping
    public String save(@RequestBody Roles roles) {
        rolesService.createRole(roles);
        return "Roles saved successfully";
    }
}
