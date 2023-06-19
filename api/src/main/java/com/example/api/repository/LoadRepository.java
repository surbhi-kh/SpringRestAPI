package com.example.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.api.entity.payload;

@Repository
public interface LoadRepository extends JpaRepository<payload, Long>{
	List<payload> findByShipperId(String shipperId);
	
	payload findById(long loadId);
}