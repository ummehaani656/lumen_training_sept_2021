package com.example.demo.ifaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.College;

@Repository
public interface CollegeReposiory extends JpaRepository<College, Integer> {

}
