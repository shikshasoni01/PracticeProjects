package com.productinfo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productinfo.entity.Product;
import com.productinfo.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	
	public List<Product> getAllProduct()
	{
		return productRepository.findAll(); 
	}
	public Optional<Product> getProductById( int id)
	{
		return productRepository.findById(id); 
	}
	
	public Product createProduct(Product product)
	{
	 return productRepository.save(product);
	}
	
	public Product updateProduct(int id ,Product product)
	{
	 return productRepository.save(product);
	}
	
	
	public void deleteById( int id)
	{
		 productRepository.deleteById(id); 
	}
}
