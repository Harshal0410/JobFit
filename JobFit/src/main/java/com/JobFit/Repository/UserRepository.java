package com.JobFit.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JobFit.Entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
