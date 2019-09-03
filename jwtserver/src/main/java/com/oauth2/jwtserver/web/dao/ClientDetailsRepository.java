package com.oauth2.jwtserver.web.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.oauth2.jwtserver.web.domain.ClientDetails;

public interface ClientDetailsRepository extends CrudRepository<ClientDetails, String>{

	public Page<ClientDetails> findAll(Pageable pageable);
	
}