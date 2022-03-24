package edu.mjv.school.projetofinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.mjv.school.projetofinal.model.Artista;
import edu.mjv.school.projetofinal.repository.ArtistaRepository;


@RestController
@RequestMapping("/artistas")
public class ArtistaControler {
	
	@Autowired
	 private ArtistaRepository repository;
	@PostMapping()
	public void gravar(@RequestBody Artista artista) {
		System.out.println("Gravando Registro");
		System.out.println(artista);
		repository.save(artista);
	}
	@PutMapping()
	public void alterar(@RequestBody Artista artista) {
		System.out.println("Alterando Registro");
		System.out.println(artista);
	}
	@DeleteMapping(value = "/{id}")
	public void excluir(@PathVariable ("id")Integer id) {
		System.out.println("Excluindo Registro");
		System.out.println("Id:" + id);
	}
	@GetMapping("/filtro")
	public List<Artista> filtrar (@RequestParam("nm")String nome) {
		System.out.println("Listando musicas pelo nome " + nome);
		return null;
	}
	@GetMapping()
	public List<Artista> listar() {
	System.out.println("Listando dados");
		return null;
	}

}
