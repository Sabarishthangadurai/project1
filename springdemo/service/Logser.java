package com.hostel.springdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.hostel.springdemo.modelO.Omodel;
import com.hostel.springdemo.Logmodel.Login;
import com.hostel.springdemo.repo.Orepo;
import com.hostel.springdemo.repository.Logrepo;


@Service
public class Logser {
	
	@Autowired
	Orepo repository;
	
	@Autowired
	Logrepo repositoryL;
	
	public String addCustomer(Omodel customer)
	{
		repository.save(customer);
		return "Added successfully";
	}
	public List<Omodel> getCustomer()
	{
		return repository.findAll();
		
	}
	public Optional<Omodel> getCustomerById(int id)
	{
		return repository.findById(id);
	}
	public String updateCustomer(Omodel customer)
	{
		repository.save(customer);
		return "Updated successfully";
	}
	public String deleteById(int id)
	{
		repository.deleteById(id);
		return "Deleted successfully";
	}
	
	public List<Omodel> getProDetails(@RequestParam String field)
	{
		return repository.findAll(Sort.by(Direction.ASC,field));
	}

	public List<Omodel> getProwithPag(int offset, int pagesize)
	{
		Page<Omodel> page=repository.findAll(PageRequest.of(offset, pagesize));
		return page.getContent();
	}
	
	public String checkLogin(String uname,String pwd)
	{
		Login user=repositoryL.findByuname(uname);
		if(user==null)
		{
			return "Invalid Details";
		}
		else
		{
			if(user.getPwd().equals(pwd))
			{
				return "Login successful";
			}
			else
			{
				return "Login failed";
			}
		}
	}
	
	public Login addUser(Login mod)
	{
		return repositoryL.save(mod);
	}
	
	
	public List<Login> getUser()
	{
		return repositoryL.findAll();
	}

}
