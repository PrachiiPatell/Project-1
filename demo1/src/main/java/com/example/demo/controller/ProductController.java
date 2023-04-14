package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.repo.ProductRepository;


@RestController
@RequestMapping("product")
@CrossOrigin	
public class ProductController {
	@Autowired
	ProductRepository pr;
	
	
	@GetMapping("/list")
	public List<Product> list(){
		return pr.list();
		
	}
	@PostMapping("/add")
	public Map<String, String> add(@RequestBody Product product) {
		pr.add(product); 
		Map<String,String> map=new HashMap<>();
		map.put("message", "Product Added Successfully");
		return map;
	}


	@GetMapping("/delete")
	public Map<String, String> delete(@RequestParam Integer id) {
		pr.remove(id);
		
		Map<String,String> map=new HashMap<>();
		map.put("msg","deleted Successfully");
		return map;
	}


	@PostMapping("/edit")
	public Map<String, String> edit(@RequestBody Product product) {
		pr.edit(product); 
		Map<String,String> map=new HashMap<>();
		map.put("msg"," Product Updated  Successfully");
		return map;
	}
	}

