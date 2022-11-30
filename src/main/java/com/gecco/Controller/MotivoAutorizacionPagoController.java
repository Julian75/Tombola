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

import com.gecco.Entity.MotivoAutorizacionPago;
import com.gecco.Service.IMotivoAutorizacionPagoService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/MotivoAutorizacionPago")
public class MotivoAutorizacionPagoController {
	@Autowired IMotivoAutorizacionPagoService service;

	@GetMapping("/Obtener")
	public List<MotivoAutorizacionPago> all() {
		return service.all();
	}

	@GetMapping("/ObtenerId/{id}")
	public Optional<MotivoAutorizacionPago> show(@PathVariable Long id) {
		return service.findById(id);
	}

	@PostMapping("/Guardar")
	@ResponseStatus(code = HttpStatus.CREATED)
	public MotivoAutorizacionPago save(@RequestBody MotivoAutorizacionPago modulo) {
		return service.save(modulo);
	}
	
	
	@PutMapping("/Modificar/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public MotivoAutorizacionPago update(@PathVariable Long id, @RequestBody MotivoAutorizacionPago modulo) {	
		Optional<MotivoAutorizacionPago> op = service.findById(id);
		
		MotivoAutorizacionPago motivoAutorizacionPagoUpdate = new MotivoAutorizacionPago();
		if (!op.isEmpty()) {			
			motivoAutorizacionPagoUpdate = op.get();					
			motivoAutorizacionPagoUpdate= modulo;			
			motivoAutorizacionPagoUpdate.setId(id);
			
		}
		return service.save(motivoAutorizacionPagoUpdate);		
	}
	
	@DeleteMapping("/Eliminar/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}
