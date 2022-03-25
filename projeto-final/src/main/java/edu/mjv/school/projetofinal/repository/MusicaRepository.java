package edu.mjv.school.projetofinal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import edu.mjv.school.projetofinal.model.Musica;

public interface MusicaRepository extends JpaRepository<Musica,Integer>{
	
//	@Query("Select m from Musica m")
//	List<Musica> listarTodos(); 
	
	@Query("Select m from Musica m left join Artista a on m.artista = a.id where a.nome = :nomeDoArtista")
	List<Musica> buscarMusicasPorArtista(String nomeDoArtista);   

}

