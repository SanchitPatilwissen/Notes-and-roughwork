package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Product;
import com.example.demo.repositories.ProductDao;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductDao repo;
	@Override
	public String addProduct(Product p) {
		repo.save(p);
		return "Successfully added Product";
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Optional<Product> getProduct(int pid) {
		// TODO Auto-generated method stub
		return repo.findById(pid);
	}
	
}
