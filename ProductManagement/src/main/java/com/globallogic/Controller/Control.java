package com.globallogic.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.Dto.ProductDto;
import com.globallogic.Model.Product;
import com.globallogic.Service.ServiceImpl;

@RestController
@RequestMapping("products/")
public class Control {
	@Autowired
	private ServiceImpl service;
	
	@PostMapping("add")
	public ResponseEntity<ProductDto> addProduct(@RequestBody  ProductDto productDto)
	{
		return new ResponseEntity<ProductDto>(service.addProduct(productDto), HttpStatus.OK);
	}
	
	@GetMapping("get/{id}")
	public ResponseEntity<ProductDto> getProduct(@PathVariable int id)
	{
		return new ResponseEntity<ProductDto>(service.getProductById(id),HttpStatus.OK);
	}
	
	@GetMapping("get")
	public ResponseEntity<List<ProductDto>> getAllProduct()
	{
		return new ResponseEntity<List<ProductDto>>(service.getAllProduct(),HttpStatus.OK);
	}
	
	@DeleteMapping("delete/{id}")
	public ResponseEntity<String> deleteById(@PathVariable   int id)
	{
		return new ResponseEntity<>(service.DeleteProduct(id),HttpStatus.OK);
	}
	
	@PutMapping("update/{id}")
	public ResponseEntity<ProductDto> update(@RequestBody ProductDto productDto, @PathVariable int id)
	{
		return new ResponseEntity<>(service.updateProduct(productDto, id),HttpStatus.OK);
	}

}
