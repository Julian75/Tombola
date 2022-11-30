package com.gecco.Service;

import java.util.List;
import java.util.Optional;

import com.gecco.Entity.ArchivoSolicitud;

public interface IArchivoSolicitudService {
	
	public List<ArchivoSolicitud> all();
	
	public Optional<ArchivoSolicitud> findById(Long id);
	
	public ArchivoSolicitud save(ArchivoSolicitud archivoSolicitud);
	
	public void delete(Long id);
}