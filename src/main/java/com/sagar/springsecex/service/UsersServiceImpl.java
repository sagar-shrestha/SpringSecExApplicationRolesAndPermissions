package com.sagar.springsecex.service;

import com.sagar.springsecex.security.entity.Audit;
import com.sagar.springsecex.security.repo.UserRepository;
import com.sagar.springsecex.security.service.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsersServiceImpl implements UsersService {

    private final UserRepository userRepository;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    @Override
    public Audit saveUsers(Audit users) {
        return userRepository.save(users);
    }

    @Override
    public String verify(Audit users) {
        Authentication authentication = authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(users.getUsername(), users.getPassword()));

        if (authentication.isAuthenticated()) {
            return jwtService.getToken(users.getUsername());
        } else if (!authentication.isAuthenticated()) {
            return "Failure";
        }
        return "Fail";
    }

    @Override
    public Audit getUsersById(Integer id) {
        return userRepository.getReferenceById(id);
    }
}
