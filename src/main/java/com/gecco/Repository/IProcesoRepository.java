package com.gecco.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gecco.Entity.Proceso;

public interface IProcesoRepository extends JpaRepository<Proceso, Long>{

}
