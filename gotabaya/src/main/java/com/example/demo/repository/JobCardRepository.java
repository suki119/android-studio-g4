package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Item;
import com.example.demo.model.JobCard;

public interface JobCardRepository  extends JpaRepository<JobCard,Integer> {

}
