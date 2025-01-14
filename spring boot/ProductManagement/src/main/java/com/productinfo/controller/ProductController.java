package com.productinfo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.productinfo.entity.Product;
import com.productinfo.service.ProductService;

@RestController
@RequestMapping("/productapi")
public class ProductController {

	@Autowired 
	private ProductService productService;
	
//	@RequestMapping(method = RequestMethod.GET, path ="/getAllProduct")
	@GetMapping("/getAllProduct")
	public List<Product> getAllProduct()
	{
		
		return productService.getAllProduct();
		
	}
	@GetMapping("/getProdectById/{id}")
	public Optional<Product> getProductById(@PathVariable Integer id)
	{
		
		return Optional.ofNullable(productService.getProductById(id).orElseThrow());
		
	}
	//create new record 
	@PostMapping("/addProduct")
	public Product saveProduct(@RequestBody Product product)
	{
		
		return productService.createProduct(product);
		
	}
	//update record in existing
	//if we use post then new record created by updating the old one
	@PutMapping("/updateProduct/{id}")
	public Product updateProduct(@PathVariable Integer id,@RequestBody Product product)
	{
		
		Product product1 = productService.getProductById(id).orElseThrow();
		product1.setProductName(product.getProductName());
		product1.setPrice(product.getPrice());
		product1.setTagline(product.getTagline());
		return productService.updateProduct(id, product1);
		
	}
	
	@DeleteMapping("/deleteById/{id}")
	public void deleteById(@PathVariable Integer id)
	{
		
		productService.deleteById(id);
		
	}
}
