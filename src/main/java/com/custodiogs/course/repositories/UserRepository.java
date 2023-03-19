package com.custodiogs.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.custodiogs.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
