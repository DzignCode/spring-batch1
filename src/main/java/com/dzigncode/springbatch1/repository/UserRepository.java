package com.dzigncode.springbatch1.repository;

import com.dzigncode.springbatch1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
