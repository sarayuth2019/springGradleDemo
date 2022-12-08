package com.example.testSpringApi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.testSpringApi.Table.User;

public interface UserRepository extends JpaRepository <User, Integer>{

}