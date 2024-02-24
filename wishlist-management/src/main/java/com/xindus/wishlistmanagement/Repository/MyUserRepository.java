package com.xindus.wishlistmanagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xindus.wishlistmanagement.Model.User;

public interface MyUserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
