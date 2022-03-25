package edu.mjv.school.projetofinal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.mjv.school.projetofinal.model.Artista;

@Repository
public interface ArtistaRepository extends JpaRepository<Artista, Integer> {
	
	List<Artista> findByNome(String nome);
	
}
