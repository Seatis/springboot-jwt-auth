package hu.mikrum.side.demojwtauth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import hu.mikrum.side.demojwtauth.domain.User;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);

}
