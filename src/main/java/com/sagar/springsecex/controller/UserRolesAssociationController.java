package com.sagar.springsecex.controller;

import com.sagar.springsecex.service.UserRolesAssociationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
@RequiredArgsConstructor
public class UserRolesAssociationController {

    private final UserRolesAssociationService userRolesAssociationService;
}
