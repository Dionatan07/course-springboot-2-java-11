package com.educandoweb.workshop.repositories;

import com.educandoweb.workshop.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
