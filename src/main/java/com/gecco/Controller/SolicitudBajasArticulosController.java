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

import com.gecco.Entity.SolicitudBajasArticulos;
import com.gecco.Service.ISolicitudBajasArticulosService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/SolicitudBajasArticulos")
public class SolicitudBajasArticulosController {
	
	@Autowired ISolicitudBajasArticulosService service;

	@GetMapping("/Obtener")
	public List<SolicitudBajasArticulos> all() {
		return service.all();
	}

	@GetMapping("/ObtenerId/{id}")
	public Optional<SolicitudBajasArticulos> show(@PathVariable Long id) {
		return service.findById(id);
	}

	@PostMapping("/Guardar")
	@ResponseStatus(code = HttpStatus.CREATED)
	public SolicitudBajasArticulos save(@RequestBody SolicitudBajasArticulos solicitudBajasArticulos) {
		return service.save(solicitudBajasArticulos);
	}
	
	
	@PutMapping("/Modificar/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public SolicitudBajasArticulos update(@PathVariable Long id, @RequestBody SolicitudBajasArticulos solicitudBajasArticulos) {	
		Optional<SolicitudBajasArticulos> op = service.findById(id);
		
		SolicitudBajasArticulos solicitudBajasArticulosUpdate = new SolicitudBajasArticulos();
		if (!op.isEmpty()) {			
			solicitudBajasArticulosUpdate = op.get();					
			solicitudBajasArticulosUpdate= solicitudBajasArticulos;			
			solicitudBajasArticulosUpdate.setId(id);
			
		}
		return service.save(solicitudBajasArticulosUpdate);
				
	}
	
	@DeleteMapping("/Eliminar/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}

}
