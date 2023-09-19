package com.pjm.alarmdemo1.data.repository;

import com.pjm.alarmdemo1.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
