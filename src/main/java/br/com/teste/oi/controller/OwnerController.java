package br.com.teste.oi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.teste.oi.domain.Owner;
import br.com.teste.oi.service.OwnerService;

@RestController
public class OwnerController {

	@Autowired
	OwnerService ownerService;

	@RequestMapping(value ="/owner", method = RequestMethod.GET)
	public ResponseEntity<List<Owner>> getOwners() {
		List<Owner> owners = ownerService.getOwners();
		
		if (owners.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<>(owners, HttpStatus.OK);
		
	}
}
