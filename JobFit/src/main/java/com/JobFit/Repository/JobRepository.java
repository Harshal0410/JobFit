package com.JobFit.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JobFit.Entity.Job;

public interface JobRepository extends JpaRepository<Job, Integer> {

}
