package testevaga.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import testevaga.model.Substacao;
import testevaga.service.SubstacaoService;

@RestController
@RequestMapping("/testando")
public class TesteCotroller {
	private SubstacaoService substacaoService;
	
	
	public TesteCotroller(SubstacaoService substacaoService) {
		this.substacaoService = substacaoService;
	}


	@GetMapping
	public List<Substacao> listTodas() {
		return substacaoService.listarTodas();
	}

}
