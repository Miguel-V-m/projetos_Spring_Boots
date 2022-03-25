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
	}
	@DeleteMapping(value = "/{id}")
	public void excluir(@PathVariable ("id")Integer id) {
		System.out.println("Excluindo Registro");
		System.out.println("Id:" + id);
	}
	
	@GetMapping("/filtro")
	public List<Musica> filtrar (@RequestParam("nm")String nome) {
		System.out.println("Listando musicas pelo nome " + nome);
		return null;
	}
	@GetMapping()
	public List<Musica> listar() {
	System.out.println("Listando dados");
		return null;
	}
	@GetMapping(value = "/{id}")
	public void buscar(@PathVariable("id") Integer id) {
		System.out.println("Buscando registro");
		System.out.println("Id:" + id);
	}

}
