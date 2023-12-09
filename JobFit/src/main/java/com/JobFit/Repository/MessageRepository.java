package com.JobFit.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JobFit.Entity.Message;

public interface MessageRepository extends JpaRepository<Message, Integer> {

}
