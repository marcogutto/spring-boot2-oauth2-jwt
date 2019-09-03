package com.oauth2.jwtserver.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oauth2.jwtserver.web.dao.ClientDetailsRepository;
import com.oauth2.jwtserver.web.domain.ClientDetails;

@RestController
@RequestMapping("/api/")
public class OAuth2Controller {
	
	@Autowired
	private ClientDetailsRepository clientDetailsRepository;
	
	@GetMapping(value="/client-details")
    public ResponseEntity<Page<ClientDetails>> findAllClientDetails(Pageable pageable) {
		
		try{
			Page<ClientDetails> list = null;
			list = clientDetailsRepository.findAll(pageable);
			
			return new ResponseEntity<>(list, HttpStatus.OK);
		}
		catch(Exception e){
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
