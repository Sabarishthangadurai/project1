package com.hostel.springdemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hostel.springdemo.modelO.Omodel;

@Repository
public interface Orepo  extends JpaRepository<Omodel,Integer>
{

}