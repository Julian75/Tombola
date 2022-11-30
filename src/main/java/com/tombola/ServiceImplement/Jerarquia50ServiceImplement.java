package com.tombola.ServiceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tombola.Entity.Jerarquia50;
import com.tombola.Repository.IJerarquia50Repository;
import com.tombola.Service.IJerarquia50Service;

@Service
public class Jerarquia50ServiceImplement implements IJerarquia50Service{
	
	@Autowired
	private IJerarquia50Repository repository;
	        
	
	@Override
	public List<Jerarquia50> all() {		
		return this.repository.findAll();
	}

	@Override
	public Optional<Jerarquia50> findById(Long id) {
		return this.repository.findById(id);
	}

	@Override
	public Jerarquia50 save(Jerarquia50 jerarquia50) {
		return this.repository.save(jerarquia50);
	}

	@Override
	public void delete(Long id) {
		this.repository.deleteById(id);		
	}

}
