package br.edu.unichristus.aulaspring.repository;

import org.springframework.stereotype.Repository;

import br.edu.unichristus.aulaspring.model.Product;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	

}
