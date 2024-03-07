package com.gingeiei.springbootcache.repository;

import com.gingeiei.springbootcache.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
