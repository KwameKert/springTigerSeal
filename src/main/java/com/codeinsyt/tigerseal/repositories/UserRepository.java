package com.codeinsyt.tigerseal.repositories;

import com.codeinsyt.tigerseal.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsername(String username);

    User findByUsernameAndPassword(String user, String password);
}
