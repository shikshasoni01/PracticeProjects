package com.product.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void createTable()
	{
		String sql = "create table productinfo(id int auto_increment primary key,"
				+ "name varchar(256),tagline varchar(256),price int)";
		jdbcTemplate.execute(sql);	
	}
	
	public void insertData(String name ,String tagline,int price)
	{
		String sql = "insert into productinfo(name,tagline,price) values(?,?,?)";
		jdbcTemplate.update(sql,name,tagline,price);	
	}
	public void updateData(int newPrice,int id)
	{
		String sql = "update productinfo set price=? where id=?";
		jdbcTemplate.update(sql,newPrice,id);	
	}
	public void deleteData(String name)
	{
		String sql = "delete from productinfo where name =?";
		jdbcTemplate.update(sql,name);	
	}
}
