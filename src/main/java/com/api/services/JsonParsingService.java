package com.api.services;

import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import org.springframework.stereotype.Service;

@Service
public class JsonParsingService {
	
	private RestTemplateConfig configuredTemplate = new RestTemplateConfig();
	
	public String parse(String url, Integer id) throws KeyManagementException, NoSuchAlgorithmException, KeyStoreException {
				
		String result = configuredTemplate.restTemplate().getForObject(url+id, String.class);
		
		return result;
	}

}
