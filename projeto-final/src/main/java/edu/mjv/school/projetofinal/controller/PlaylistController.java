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

import edu.mjv.school.projetofinal.model.Playlist;
import edu.mjv.school.projetofinal.repository.PlaylistRepository;


@RestController
@RequestMapping("/playlists")
public class PlaylistController {
	
	@Autowired
	 private PlaylistRepository repository; 
	@PostMapping()
	public void gravar(@RequestBody Playlist playlist) {
		System.out.println("Gravando Registro");
		System.out.println(playlist);
		repository.save(playlist);
	}
	@PutMapping()
	public void alterar(@RequestBody Playlist playlist) {
		System.out.println("Alterando Registro");
		System.out.println(playlist);
	}
	@DeleteMapping(value = "/{id}")
	public void excluir(@PathVariable ("id")Integer id) {
		System.out.println("Excluindo Registro");
		System.out.println("Id:" + id);
	}
	@GetMapping("/filtro")
	public List<Playlist> filtrar (@RequestParam("nm")String nome) {
		System.out.println("Listando musicas pelo nome " + nome);
		return null;
	}
	@GetMapping()
	public List<Playlist> listar() {
	System.out.println("Listando dados");
		return null;
	}

}
