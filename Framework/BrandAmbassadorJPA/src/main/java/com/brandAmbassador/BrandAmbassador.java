package com.brandAmbassador;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="brand_ambassador")
public class BrandAmbassador {
	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		@Column(name="name")
		private String name;
		@Column(name="price")
		private double price;
		@Column(name="ranking")
		private double ranking;
		@OneToOne(mappedBy="brandAmbassador")
		private Company company;
		public BrandAmbassador() {
			
		}
		
		public BrandAmbassador(String name, double price, double ranking) {
			
			this.name = name;
			this.price = price;
			this.ranking = ranking;
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
		public double getRanking() {
			return ranking;
		}
		public void setRanking(double ranking) {
			this.ranking = ranking;
		}
		public Company getCompany() {
			return company;
		}
		public void setCompany(Company company) {
			this.company = company;
		}
		
		
		
}
