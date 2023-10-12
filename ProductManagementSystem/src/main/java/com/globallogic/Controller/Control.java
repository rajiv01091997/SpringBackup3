package com.globallogic.Controller;

import com.globallogic.Dao.CategoryRepo;
import com.globallogic.Dao.ProductRepo;
import com.globallogic.Entity.Category;
import com.globallogic.Entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class Control {

    @Autowired
   private  ProductRepo productRepo;

    @Autowired
    private CategoryRepo categoryRepo;
//    @PostMapping("/add")
//    public ResponseEntity<Category> saveProduct(@RequestBody Category category)
//    {
//
//        return new ResponseEntity<>(categoryRepo.save(category), HttpStatus.OK);
//    }

    @PostMapping("/add")
    public ResponseEntity<Product> saveProduct(@RequestBody Product product)
    {

        return new ResponseEntity<>(productRepo.save(product), HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable int id)
    {
        return new ResponseEntity<>(productRepo.findById(id).get(),HttpStatus.OK);
    }

    @GetMapping("/get")
    public ResponseEntity<List<Product>> getAllProduct()
    {
        return new ResponseEntity<>(productRepo.findAll(),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable int id)
    {
        productRepo.deleteById(id);
        return "Deleted";
    }

    @GetMapping("/{price}")
    public List<Product> getAllGreater(@PathVariable int price)
    {
        return productRepo.findAllByPriceGreaterThan(price);
    }
}
