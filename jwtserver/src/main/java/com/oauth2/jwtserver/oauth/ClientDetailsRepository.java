package com.oauth2.jwtserver.oauth;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface ClientDetailsRepository extends CrudRepository<ClientDetails, String>{

	public Page<ClientDetails> findAll(Pageable pageable);
	
}