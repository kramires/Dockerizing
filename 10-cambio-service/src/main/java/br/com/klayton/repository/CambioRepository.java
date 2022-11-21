package br.com.klayton.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.klayton.model.Cambio;

public interface CambioRepository extends JpaRepository<Cambio, Long> {

	Cambio findByFromAndTo(String from, String to);
	
}