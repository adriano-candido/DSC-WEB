package br.edu.unichristus.aulaspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unichristus.aulaspring.model.Product;
import br.edu.unichristus.aulaspring.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	
	public Product create(Product product) {
		return repository.save(product);
	}
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	

}
