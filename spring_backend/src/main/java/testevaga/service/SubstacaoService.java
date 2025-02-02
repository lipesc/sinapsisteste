package testevaga.service;

import java.util.List;

import org.springframework.stereotype.Service;

import testevaga.model.Substacao;
import testevaga.repository.H2Repository;

@Service
public class SubstacaoService {

	private H2Repository h2Repository;

	public SubstacaoService(H2Repository h2Repository) {
		super();
		this.h2Repository = h2Repository;
	}
	
	public List<Substacao> listarTodas() {
		return h2Repository.findAll();
	}
	
}
