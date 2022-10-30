package com.example.testsecurity2dbthemeleaf.repository;

import com.example.testsecurity2dbthemeleaf.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}
