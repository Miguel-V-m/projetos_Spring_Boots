package edu.mjv.school.projetofinal.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "artista")
public class Artista {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nome; 
		
	@OneToMany(mappedBy = "artista")
	private List<Musica> musicas;
	
public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
		
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getArtista() {
		return nome;
	}
	public void setArtista(String artista) {
		this.nome = artista;
	}
	@Override
	public String toString() {
		return "Artista [id=" + id + ", artista=" + nome + "]";
	}
	public List<Musica> getMusicas() {
		return musicas;
	}
	public void setMusicas(List<Musica> musicas) {
		this.musicas = musicas;
	}
	

}
