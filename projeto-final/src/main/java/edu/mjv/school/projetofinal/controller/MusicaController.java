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

import edu.mjv.school.projetofinal.model.Musica;
import edu.mjv.school.projetofinal.repository.MusicaRepository;

@RestController
@RequestMapping("/musica")
public class MusicaController {
	
	@Autowired
	private MusicaRepository repository;
	@PostMapping()
	public void gravar(@RequestBody Musica musica) {
		System.out.println("Gravando Registro");
		System.out.println(musica);
		repository.save(musica);
	}
	@PutMapping()
	public void alterar(@RequestBody Musica musica) {
		System.out.println("Alterando Registro");
		System.out.println(musica);
		repository.save(musica);
	}
	
	@GetMapping("/filtrarPorNome")
	public List<Musica> buscarPorNome(@RequestParam("nome") String nome) {
		System.out.println("Listando artistas pelo nome: " + nome);
		List<Musica> artistaEncontrados = repository.findByNome(nome);
		return artistaEncontrados;
	}
	
	@GetMapping()
	public List<Musica> listarTodas(){
		List<Musica> todasAsMusicas  = repository.findAll();
		for(Musica musica:todasAsMusicas) {
			System.out.println("ID: " + musica.getId());
		}
		return todasAsMusicas;
	}
	
	@DeleteMapping(value = "/{id}")
	public void excluir(@PathVariable ("id") Integer id) {
		Musica musicaDeletada = repository.findById(id).orElse(null);
		System.out.println("Excluindo consulta");
		repository.delete(musicaDeletada);
	}
	
	
	
}
