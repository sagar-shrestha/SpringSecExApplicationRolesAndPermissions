package com.sagar.springsecex.security.config;

import com.sagar.springsecex.security.entity.UserPrincipal;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Slf4j
@Component
@RequiredArgsConstructor
public class JwtUtil {

    private final UserDetailsService userDetailsService;

    public Integer getClaimsOfCurrentAuthenticatedContext() {
        return  ((UserPrincipal) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUserId();
    }

    public Integer getCurrentUserId() {
        try {
            Integer userId = getClaimsOfCurrentAuthenticatedContext();
            if (Objects.isNull(userId)) {
                return 0;
            } else {
                return Integer.parseInt(userId.toString());
            }
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return 0;
        }
    }
}
