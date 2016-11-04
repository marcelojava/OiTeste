package br.com.teste.oi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.teste.oi.domain.Setting;
import br.com.teste.oi.service.SettingService;

@RestController
public class SettingController {
	
	@Autowired
	SettingService settingService;

	@RequestMapping(value="/settings", method = RequestMethod.GET)
	public ResponseEntity<List<Setting>> findAll() {
		List<Setting> settings = settingService.getSettings();
		
		return new ResponseEntity<>(settings, HttpStatus.OK);
	}
	
	@RequestMapping(value="/settings/{id}", method = RequestMethod.GET)
	public ResponseEntity<Setting> find(@PathVariable("id") Long id) {
		Optional<Setting> settings = settingService.findById(id);
		
		return new ResponseEntity<>(settings.isPresent() ? 
				settings.get() : null, HttpStatus.OK);
	}
	
	@RequestMapping(value="/settings", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<Void> create(@RequestBody Setting setting) {
		settingService.create(setting);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/settings", method = RequestMethod.PATCH)
	public ResponseEntity<Void> update(@RequestBody Setting setting) {
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
