package com.globallogic.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globallogic.Dto.CategoryDto;
import com.globallogic.Dto.ProductDto;
import com.globallogic.Model.Category;
import com.globallogic.Model.Product;
import com.globallogic.Repository.ProductRepo;

@Service
public class ServiceImpl {
	@Autowired
	private ProductRepo prodRepo;
	
	public  ProductDto addProduct(ProductDto productDto)
	{
		
		  prodRepo.save(dtoToProduct(productDto));
		
		
		return productDto;
	}
	
	public ProductDto getProductById(int id)
	{
		return  productToDto(prodRepo.findById(id).get());
		
	}
	
	public List<ProductDto> getAllProduct()
	{
		List<Product> list=prodRepo.findAll();
		List<ProductDto> list2=new ArrayList<>();
		
		for(Product prod:list)
		{
			list2.add(productToDto(prod));
		}
		return list2;
	}
	
	
	public String DeleteProduct(int id)
	{
		prodRepo.deleteById(id);
		return "Deleted successfully";
	}
	
	public ProductDto updateProduct(ProductDto productDto,int id)
	{
		  prodRepo.save(dtoToProduct(productDto));
			
			
			return productDto;
	}
	
	
	public  Product dtoToProduct(ProductDto productDto)
	{
		Product product=new Product();
		Category category=new Category();
		
		product.setId(productDto.getId());
		product.setName(productDto.getName());
		product.setPrice(productDto.getPrice());
		
		category.setCategoryId(productDto.getCategoryDto().getCategoryId());
		category.setCategory(productDto.getCategoryDto().getCategory());
		
		product.setCategory(category);
		category.setProduct(product);
		
		return product;
		
	}
	
	public ProductDto productToDto(Product product)
	{
		ProductDto prod=new ProductDto();
		CategoryDto cat=new CategoryDto();
		
		prod.setId(product.getId());
		prod.setName(product.getName());
		prod.setPrice(product.getPrice());
		
		cat.setCategoryId(product.getCategory().getCategoryId());
		cat.setCategory(product.getCategory().getCategory());
		
		prod.setCategoryDto(cat);
		
		return prod;
		
		
	}

}
