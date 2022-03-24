package edu.mjv.school.projetofinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
	private MusicaRepository musicaRepository;
	
	@PostMapping()
	public ResponseEntity<Musica> inserirMusica(@RequestBody Musica musica) {
		
		if(musica!=null) {
			musicaRepository.save(musica);
			return ResponseEntity.ok(musica);
		}
		return ResponseEntity.badRequest().build();
	}
	
	@PutMapping()
    public void alterar(@RequestBody Musica musica) {
		System.out.println("alterando registros");
		System.out.println("musicas");
	}
	
    @DeleteMapping(value = "/{id}")
    public void excluir(@PathVariable("id") Integer id) {
    	musicaRepository.deleteById(id);
	}
    
//    @GetMapping("/filtro")
//    public List<Musica> filtar(@RequestParam("nm") String nome){
//    	musicaRepository.
//    }
    
    @GetMapping()
    public List<Musica> listarTodos() {
    	List<Musica> musicas = musicaRepository.listarTodos();
    	return musicas;
	}

}
