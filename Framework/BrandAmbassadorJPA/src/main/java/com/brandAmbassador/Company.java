package com.brandAmbassador;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="company_table")
public class Company {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="company_name")
	private String companyName;
	@Column(name="company_category")
	private String companyCategory;
	@Column(name="annual_turnover")
	private double annualTurnOver;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="ambassador_id",unique=true)
	private BrandAmbassador brandAmbassador;
	public Company() {
		
	}
	
	public Company(String companyName, String companyCategory, double annualTurnOver, BrandAmbassador brandAmbassador) {
		
		this.companyName = companyName;
		this.companyCategory = companyCategory;
		this.annualTurnOver = annualTurnOver;
		this.brandAmbassador = brandAmbassador;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyCategory() {
		return companyCategory;
	}
	public void setCompanyCategory(String companyCategory) {
		this.companyCategory = companyCategory;
	}
	public double getAnnualTurnOver() {
		return annualTurnOver;
	}
	public void setAnnualTurnOver(double annualTurnOver) {
		this.annualTurnOver = annualTurnOver;
	}
	public BrandAmbassador getBrandAmbassador() {
		return brandAmbassador;
	}
	public void setBrandAmbassador(BrandAmbassador brandAmbassador) {
		this.brandAmbassador = brandAmbassador;
	}
	
	
	
}
