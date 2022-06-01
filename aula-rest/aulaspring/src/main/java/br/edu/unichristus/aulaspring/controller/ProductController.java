package br.edu.unichristus.aulaspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.unichristus.aulaspring.model.Product;
import br.edu.unichristus.aulaspring.service.ProductService;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@PostMapping(produces = { "application/json", "application/xml"}, consumes = {
			"application/json","application/xml" })
	public Product create(@RequestBody Product product) {
		return service.create(product);
	}
	
	@GetMapping(produces = { "application/json", "application/xml"})
	public List<Product> findAll() {
		return service.findAll();
	}
	
}
