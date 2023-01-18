package com.ista.springboot.web.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ista.springboot.web.app.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
