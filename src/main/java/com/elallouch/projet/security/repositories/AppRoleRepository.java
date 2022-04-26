package com.elallouch.projet.security.repositories;

import com.elallouch.projet.security.entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRole, Long> {
    AppRole findByRoleName(String rolename);
}
