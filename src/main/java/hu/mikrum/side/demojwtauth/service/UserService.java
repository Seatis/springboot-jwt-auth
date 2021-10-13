package hu.mikrum.side.demojwtauth.service;

import java.util.List;
import hu.mikrum.side.demojwtauth.domain.Role;
import hu.mikrum.side.demojwtauth.domain.User;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();

}
