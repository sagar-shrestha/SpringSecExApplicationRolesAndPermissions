package com.sagar.springsecex.security.repo;

import com.sagar.springsecex.security.entity.Audit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Audit, Integer> {

    Audit findByUsername(String username);
}
