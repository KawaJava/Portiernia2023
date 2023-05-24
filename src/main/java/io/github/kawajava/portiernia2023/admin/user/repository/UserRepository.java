package io.github.kawajava.portiernia2023.admin.user.repository;

import io.github.kawajava.portiernia2023.admin.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
