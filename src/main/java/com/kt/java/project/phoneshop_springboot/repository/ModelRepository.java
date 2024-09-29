package com.kt.java.project.phoneshop_springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kt.java.project.phoneshop_springboot.entity.Model;

@Repository
public interface ModelRepository extends JpaRepository<Model, Integer>{

}
