package edu.mjv.school.projetofinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mjv.school.projetofinal.repository.MusicaRepository;

@Service
public class MusicaService {
	
	@Autowired
	private MusicaRepository musicaRepository;

	public MusicaService(MusicaRepository musicaRepository) {
		this.musicaRepository = musicaRepository;
	}

}
