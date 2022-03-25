package edu.mjv.school.projetofinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import edu.mjv.school.projetofinal.model.Artista;


//@Repository
public interface ArtistaRepository extends JpaRepository<Artista, Integer> {
	
	//List<Artista> buscarMusicasPorArtista(String nome);
	
	//@Query("Select m from Musica m left join Artista a on m.artista = a.id where a.nome = :nomeDoArtista")
	//List<Musica> buscarMusicasPorArtista(String nome);	 
	

}
