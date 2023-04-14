package com.example.demo.repo;

import java.util.ArrayList;
import com.example.demo.model.Product;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.model.Product;
@Component
public class ProductRepository {
	private List<Product> productList=null;
	public ProductRepository() {
		super();
 		this.productList = new ArrayList<Product>();
	}

	public List<Product> list(){
		return productList; 
	}

	public void add(Product product) {
		productList.add(product);
	}

	public void edit(Product updatedProduct) {
		int index =0; 
		for (Product product : productList) {
			
			if(product.getId().equals(updatedProduct.getId())) {
				break;
			}
			index++;
		}
		System.out.println(index+" "+updatedProduct);
		productList.set(index, updatedProduct);
	}

	public void remove(Integer id) {
		this.productList.removeIf(u -> u.getId().equals(id));
	}
}
