package com.example.api.service;


import java.util.List;

import com.example.api.entity.payload;

public interface LoadService {
	
	public payload saveload(payload load);

	public List<payload> findByShipperId(String shipperId);
  
	public payload findById(Long loadId);

	public void deleteById(Long loadId);

}
