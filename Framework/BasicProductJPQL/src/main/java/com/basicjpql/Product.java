package com.basicjpql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_table")
public class Product {

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		@Column(name="name")
		private String name;
		@Column(name="price")
		private double price;
		@Column(name="brand")
		private String brand;
		public Product() {
			
		}
		public Product(String name, double price, String brand) {
			this.name = name;
			this.price = price;
			this.brand = brand;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		@Override
		public String toString() {
			return "Product [id=" + id + ", name=" + name + ", price=" + price + ", brand=" + brand + "]";
		}
		
		
}
