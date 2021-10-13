package hu.mikrum.side.demojwtauth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import hu.mikrum.side.demojwtauth.domain.Role;

public interface RoleRepo extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
