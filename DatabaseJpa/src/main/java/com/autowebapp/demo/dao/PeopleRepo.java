package com.autowebapp.demo.dao;
import org.springframework.data.repository.CrudRepository;

import com.autowebapp.demo.model.People;

public interface PeopleRepo extends CrudRepository<People,Integer>
{
	
}