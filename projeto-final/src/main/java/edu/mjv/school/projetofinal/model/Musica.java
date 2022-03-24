package edu.mjv.school.projetofinal.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="musica")
public class Musica {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nome;
	private double duracao;
	
	@ManyToOne
	@JoinColumn(name ="id_artista")
	private Artista artista;
	
	@ManyToMany(mappedBy="musicas")
	private List<Playlist> playlist;
		
	public double getDuracao() {
		return duracao;
	}
	public void setDuracao(double duracao) {
		this.duracao = duracao;
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
	@Override
	public String toString() {
		return "MusicaResipitory [id=" + id + ", nome=" + nome + "]";
	}
	
	

}
