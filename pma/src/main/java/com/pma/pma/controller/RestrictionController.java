package com.pma.pma.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pma.pma.model.Restriction;
import com.pma.pma.service.RestrictionService;

@Controller
@RequestMapping("/restriction")
public class RestrictionController {
	
	@Autowired
	private RestrictionService restrictionService;
	
	
	@RequestMapping("/")
	public ResponseEntity<List<Restriction>> findAll() {
		return new ResponseEntity<List<Restriction>>(restrictionService.findAll(),HttpStatus.OK);
	}
	
	@RequestMapping("/{id}")
	public ResponseEntity<Restriction> findById(@PathVariable ("id") Long id) {
		
		Optional<Restriction> restriction = restrictionService.findById(id);
		
		return new ResponseEntity<Restriction>(restriction.get(),HttpStatus.OK);
	}
	
	@RequestMapping("/news/restriction/{id}")
	public ResponseEntity<Restriction> findByNewsId(@PathVariable ("id") Long id) {
		
		Restriction restriction = restrictionService.findByNewsId(id);
		
		return new ResponseEntity<Restriction>(restriction,HttpStatus.OK);
	}
	
	@RequestMapping("/save")
	public ResponseEntity<Restriction> save(@RequestBody Restriction restriction) {
	
		restriction = restrictionService.save(restriction);
		
		return new ResponseEntity<Restriction>(restriction,HttpStatus.OK);
	}

}
