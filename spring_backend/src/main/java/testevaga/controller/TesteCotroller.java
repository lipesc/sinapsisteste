package testevaga.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TesteCotroller {
	
	@GetMapping("/api")
	public ResponseEntity<Map<String, String>> msn() {
		Map <String, String> response =  Map.of("msg", "teste endpoint");
		
		
		return new ResponseEntity<>(response, HttpStatus.OK);
		
	}
	
	@GetMapping
	public ResponseEntity<Integer>  msg() {
		
		String  response = "testando";
		
		Integer num = 1;
		return new ResponseEntity<>(num, HttpStatus.CREATED);
	}
}
