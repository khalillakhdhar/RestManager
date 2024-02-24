package com.elite.rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elite.rest.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
