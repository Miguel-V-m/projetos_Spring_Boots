package edu.mjv.school.projetofinal.controller;

import java.util.List;

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


@RestController
@RequestMapping("/musica")
public class MusicaController {
	@PostMapping()
	public void gravar(@RequestBody Musica musica) {
		System.out.println("gravando registro");
		System.out.println("musicas");
	}
	
	@PutMapping()
    public void alterar(@RequestBody Musica musica) {
		System.out.println("alterando registros");
		System.out.println("musicas");
	}
	
    @DeleteMapping(value = "/{id}")
    public void excluir(@PathVariable("id") Integer id) {
    	System.out.println("excluindo registros");
    	System.out.println("Id:" + id);
	}
    
    @GetMapping("/filtro")
    public List<Musica> filtar(@RequestParam("nm") String nome){
    	System.out.println("Listando cadastros pelo nome" + nome);
    	return null;
    }
    
    @GetMapping()
    public List<Musica> listarTodos() {
    	System.out.println("listando todos");    	
    	return null;
	}

}
