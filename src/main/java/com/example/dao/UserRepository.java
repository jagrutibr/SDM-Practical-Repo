package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pojos.Users;


public interface UserRepository extends JpaRepository<Users,Integer>{

}
