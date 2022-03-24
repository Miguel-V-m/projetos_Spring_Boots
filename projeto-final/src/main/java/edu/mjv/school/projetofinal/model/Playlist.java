package edu.mjv.school.projetofinal.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "playlist")
public class Playlist {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nome;
	
	@ManyToMany
	@JoinTable(name = "playlist_musica", joinColumns = @JoinColumn(name = "id_playlist"),
            inverseJoinColumns = @JoinColumn(name = "id_musica"))
    private List<Musica> musicas;
	
	public List<Musica> getMusicas() {
		return musicas;
	}

	public void setMusicas(List<Musica> musicas) {
		this.musicas = musicas;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
