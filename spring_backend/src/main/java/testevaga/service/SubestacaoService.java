package testevaga.service;

import java.util.List;

import org.springframework.stereotype.Service;

import testevaga.model.Subestacao;
import testevaga.repository.H2Repository;

@Service
public class SubestacaoService {

	private H2Repository h2Repository;

	public SubestacaoService(H2Repository h2Repository) {

		this.h2Repository = h2Repository;
	}
	
	public List<Subestacao> listarTodas() {
		return h2Repository.findAll();
	}
	
}
