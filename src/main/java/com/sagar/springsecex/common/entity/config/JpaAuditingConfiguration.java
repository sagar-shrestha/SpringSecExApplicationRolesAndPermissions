package com.sagar.springsecex.common.entity.config;

import com.sagar.springsecex.security.config.JwtUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;

@Slf4j
@Configuration
@RequiredArgsConstructor
@EnableJpaAuditing(auditorAwareRef = "auditorProvider")
public class JpaAuditingConfiguration {

    private final JwtUtil jwtUtil;

    @Bean
    public AuditorAware<Integer> auditorProvider() {
        return () -> {
            try {
                return Optional.of(jwtUtil.getCurrentUserId());
            } catch (Exception e) {
                log.info(e.getMessage());
                return Optional.of(-1);
            }
        };
    }
}
