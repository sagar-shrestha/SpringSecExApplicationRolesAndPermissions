package com.sagar.springsecex.security.service;

import com.sagar.springsecex.security.entity.UserPrincipal;
import com.sagar.springsecex.security.entity.Audit;
import com.sagar.springsecex.security.repo.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDetailServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Audit users = userRepository.findByUsername(username);
        return new UserPrincipal(users);
    }
}
