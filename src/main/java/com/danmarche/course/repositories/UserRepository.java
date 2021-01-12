package com.danmarche.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danmarche.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
