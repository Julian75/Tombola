package com.gecco.EntityModifica;

public class TipoActivo2 {
	
	Long id;
	String descripcion;
	Long idEstado;
	
	public TipoActivo2() {
		super();
	}

	public TipoActivo2(Long id, String descripcion, Long idEstado) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.idEstado = idEstado;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Long getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(Long idEstado) {
		this.idEstado = idEstado;
	}

	
	
}
