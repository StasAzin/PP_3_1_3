package ru.kata.spring.boot_security.demo.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import ru.kata.spring.boot_security.demo.models.Role;
import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    boolean addUser(User user);

    void updateUser(Long id, User user);

    void deleteUser(Long id);

    List<User> getUsers();

    User getUserById(Long id);

    User findByUsername(String username);

    List<Role> getRoles();

    @Override
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
