package com.felipeAugusto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipeAugusto.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
