package com.ug.encuesta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ug.encuesta.dominio.Subgrupo;
import com.ug.encuesta.repository.SubgrupoRepository;

@RestController
public class SubgrupoController {
	@Autowired
	private SubgrupoRepository subgrupoRepository;
		
		@RequestMapping(value="/subgrupos",method=RequestMethod.POST)
		public ResponseEntity<?> save(@RequestBody Subgrupo subgrupo){
			//System.out.println(requisito.getRequisito_id());
			subgrupoRepository.save(subgrupo);
			return new ResponseEntity<>(HttpStatus.CREATED);
		}
		
		@RequestMapping(value="/subgrupos",method=RequestMethod.GET)
		public ResponseEntity<?> findAll(){
			Iterable<Subgrupo> subgrupo=subgrupoRepository.findAll();
			return new ResponseEntity<>(subgrupo,HttpStatus.OK);
			
			}
		
		@RequestMapping(value="/subgrupos/{subgrupo_id}",method=RequestMethod.GET)
		public ResponseEntity<?> findOne(@PathVariable int subgrupo_id){
			Subgrupo requisitos=subgrupoRepository.findOne(subgrupo_id);
			return new ResponseEntity<>(requisitos,HttpStatus.OK);
			
			}

}
