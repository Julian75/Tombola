package com.tombola.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tombola.Entity.Jerarquia50;
import com.tombola.Service.IJerarquia50Service;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/Jerarquia")
public class Jerarquia50Controller {

	@Autowired IJerarquia50Service service;

	@GetMapping("/Obtener")
	public List<Jerarquia50> all() {
		return service.all();
	}

	@GetMapping("/ObtenerId/{id}")
	public Optional<Jerarquia50> show(@PathVariable Long id) {
		return service.findById(id);
	}

	@PostMapping("/Guardar")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Jerarquia50 save(@RequestBody Jerarquia50 Jerarquia50) {
		return service.save(Jerarquia50);
	}
	
	
	@PutMapping("/Modificar/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Jerarquia50 update(@PathVariable Long id, @RequestBody Jerarquia50 jerarquia50) {	
		Optional<Jerarquia50> op = service.findById(id);
		
		Jerarquia50 Jerarquia50Update = new Jerarquia50();
		if (!op.isEmpty()) {			
			Jerarquia50Update = op.get();					
			Jerarquia50Update= jerarquia50;			
			Jerarquia50Update.setId(id);
			
		}
		return service.save(Jerarquia50Update);
				
	}
	
	@DeleteMapping("/Eliminar/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}
