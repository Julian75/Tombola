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

import com.gecco.Entity.CotizacionPdf;
import com.gecco.Service.ICotizacionPdfService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/CotizacionPdf")
public class CotizacionPdfController {

	@Autowired ICotizacionPdfService service;

	@GetMapping("/Obtener")
	public List<CotizacionPdf> all() {
		return service.all();
	}

	@GetMapping("/ObtenerId/{id}")
	public Optional<CotizacionPdf> show(@PathVariable Long id) {
		return service.findById(id);
	}

	@PostMapping("/Guardar")
	@ResponseStatus(code = HttpStatus.CREATED)
	public CotizacionPdf save(@RequestBody CotizacionPdf cotizacionPdf) {
		return service.save(cotizacionPdf);
	}
	
	
	@PutMapping("/Modificar/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public CotizacionPdf update(@PathVariable Long id, @RequestBody CotizacionPdf cotizacionPdf) {	
		Optional<CotizacionPdf> op = service.findById(id);
		
		CotizacionPdf cotizacionPdfUpdate = new CotizacionPdf();
		if (!op.isEmpty()) {			
			cotizacionPdfUpdate = op.get();					
			cotizacionPdfUpdate= cotizacionPdf;			
			cotizacionPdfUpdate.setId(id);
			
		}
		return service.save(cotizacionPdfUpdate);
				
	}
	
	@DeleteMapping("/Eliminar/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}