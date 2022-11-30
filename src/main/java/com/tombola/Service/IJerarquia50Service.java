package com.tombola.Service;

import java.util.List;
import java.util.Optional;

import com.tombola.Entity.Jerarquia50;

public interface IJerarquia50Service {

	public List<Jerarquia50> all();
	
	public Optional<Jerarquia50> findById(Long id);
	
	public Jerarquia50 save(Jerarquia50 jerarquia50);
	
	public void delete(Long id);
}
