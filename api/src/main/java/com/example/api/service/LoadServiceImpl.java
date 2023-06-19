package com.example.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.api.entity.payload;
import com.example.api.repository.LoadRepository;

@Service
public class LoadServiceImpl implements LoadService{

	private final LoadRepository loadrepository;
	
	public LoadServiceImpl(LoadRepository loadsrepository) {
        this.loadrepository = loadsrepository;
    }
	
	@Override
	public payload saveload(payload load) {
		return loadrepository.save(load);
	}

	@Override
	public List<payload> findByShipperId(String shipperId){
		return loadrepository.findByShipperId(shipperId);
	}

	@Override
	public payload findById(Long loadId) {
		return loadrepository.findById(loadId).orElse(null);
	}
	
	@Override
	public void deleteById(Long loadId) {
        loadrepository.deleteById(loadId);
    }
}
