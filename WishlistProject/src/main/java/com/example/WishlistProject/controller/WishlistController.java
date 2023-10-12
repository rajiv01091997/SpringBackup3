package com.example.WishlistProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.WishlistProject.dto.WishlistDto;
import com.example.WishlistProject.serv.WishService;

@RestController
@RequestMapping("/api/v1")
public class WishlistController {
@Autowired
private WishService wishService;
@PostMapping("/")
public ResponseEntity<WishlistDto> persistWishlist(@RequestBody  WishlistDto wishlistDto)	
{
	return new ResponseEntity<WishlistDto>(wishlistDto, HttpStatus.ACCEPTED);
}
@GetMapping("/get")
public String getMsg()
{
	return "HelloMongo";
}
}
