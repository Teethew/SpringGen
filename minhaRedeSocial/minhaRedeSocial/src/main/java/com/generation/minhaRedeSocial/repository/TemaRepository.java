package com.generation.minhaRedeSocial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.minhaRedeSocial.model.Tema;

public interface TemaRepository extends JpaRepository<Tema, Long> {
	public List<Tema> findAllByDescricaoContainingIgnoreCase (String descricao);
}
