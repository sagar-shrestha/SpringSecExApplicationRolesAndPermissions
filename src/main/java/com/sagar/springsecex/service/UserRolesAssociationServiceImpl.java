package com.sagar.springsecex.service;

import com.sagar.springsecex.entity.Roles;
import com.sagar.springsecex.entity.UserRolesAssociation;
import com.sagar.springsecex.repository.UserRolesAssociationRepository;
import com.sagar.springsecex.security.entity.Audit;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserRolesAssociationServiceImpl implements UserRolesAssociationService {

    private final UserRolesAssociationRepository userRolesAssociationRepository;
    private final UsersService  usersService;
    private final RolesService rolesService;

    @Override
    public void saveUserRolesAssociation(UserRolesAssociation userRolesAssociation) {
       Audit audit = usersService.getUsersById(userRolesAssociation.getAudit().getId());
        Roles  roles = rolesService.getRoleById(userRolesAssociation.getRole().getId());

        UserRolesAssociation association = UserRolesAssociation
                .builder()
                .role(roles)
                .audit(audit)
                .effectiveFrom(LocalDate.now())
                .effectiveTo(LocalDate.now())
                .build();
        userRolesAssociationRepository.save(association);
    }

    @Override
    public List<UserRolesAssociation> getAllUserRolesAssociation() {
        return List.of();
    }
}
