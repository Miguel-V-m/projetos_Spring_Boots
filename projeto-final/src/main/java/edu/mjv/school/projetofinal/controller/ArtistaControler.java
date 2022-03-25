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
		repository.save(artista);
	}
	// pode ser listar pode nome
//	@GetMapping("/filtrarPorNome")
//	public List<Artista> buscarPorNome(@RequestParam("nome") String nome) {
//		System.out.println("Listando artistas pelo nome: " + nome);
//		List<Artista> artistaEncontrados = repository.buscarMusicasPorArtista(nome);
//		return artistaEncontrados;
//	}
	
	@GetMapping("/listarTodos")
	public List<Artista> listarTodo() {
		List<Artista> todosOsArtistas = repository.findAll();
		for (Artista artista : todosOsArtistas) {
			System.out.println("ID: " + artista.getId());
		}
		return todosOsArtistas;
	}
	
	@GetMapping(value = "/{id}")
	public Artista buscarArtistaPorId(@PathVariable("id") Integer id) {
		Artista artista = repository.findById(id).orElse(null);
		System.out.println("Buscando artista por Id:" + id);
		return artista;
	}
	
	@DeleteMapping(value = "/{id}")
	public void excluir(@PathVariable ("id") Integer id) {
		Artista artistaDeletada = repository.findById(id).orElse(null);
		System.out.println("Excluindo consulta");
		repository.delete(artistaDeletada);
	}

}
