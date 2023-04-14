package com.example.demo.model;

public class Product {
	private String name;
	private Integer id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", id=" + id + "]";
	}
//	public static void set(int index, Product updatedProduct) {
//		// TODO Auto-generated method stub
//		
//	}

}
