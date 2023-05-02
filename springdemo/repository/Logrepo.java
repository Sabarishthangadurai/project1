package com.hostel.springdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hostel.springdemo.Logmodel.Login;



@Repository
public interface Logrepo extends JpaRepository<Login,String> 
{
    Login findByuname(String uname);
}