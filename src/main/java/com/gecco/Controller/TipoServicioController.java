package com.gecco.Controller;

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

import com.gecco.Entity.TipoServicio;
import com.gecco.Service.ITipoServicioService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/TipoServicio")
public class TipoServicioController {
	@Autowired ITipoServicioService service;

	@GetMapping("/Obtener")
	public List<TipoServicio> all() {
		return service.all();
	}

	@GetMapping("/ObtenerId/{id}")
	public Optional<TipoServicio> show(@PathVariable Long id) {
		return service.findById(id);
	}

	@PostMapping("/Guardar")
	@ResponseStatus(code = HttpStatus.CREATED)
	public TipoServicio save(@RequestBody TipoServicio tipoServicio) {
		return service.save(tipoServicio);
	}
	
	
	@PutMapping("/Modificar/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public TipoServicio update(@PathVariable Long id, @RequestBody TipoServicio tipoServicio) {	
		Optional<TipoServicio> op = service.findById(id);
		
		TipoServicio tipoServicioUpdate = new TipoServicio();
		if (!op.isEmpty()) {			
			tipoServicioUpdate = op.get();					
			tipoServicioUpdate= tipoServicio;			
			tipoServicioUpdate.setId(id);
			
		}
		return service.save(tipoServicioUpdate);
				
	}
	
	@DeleteMapping("/Eliminar/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}