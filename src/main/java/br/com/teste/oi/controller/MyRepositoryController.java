package br.com.teste.oi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.teste.oi.domain.Repository;
import br.com.teste.oi.service.RepositoryService;

@RestController
public class MyRepositoryController {
	
	@Autowired
	RepositoryService repositoryService;
	
	@RequestMapping(value = "/repository", method = RequestMethod.GET)
	public ResponseEntity<List<Repository>> getRepository() {
		List<Repository> repositories = repositoryService.getRepositories();
		
		if (repositories.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<>(repositories, HttpStatus.OK);
	}

}
