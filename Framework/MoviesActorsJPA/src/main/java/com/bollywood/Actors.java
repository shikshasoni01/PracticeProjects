package com.bollywood;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="actors_list")
public class Actors {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="actor_name")
	private String actorName;
	@Column(name="age")
	private int age;
	@Column(name="marital_status")
	private String maritalStatus;
	@ManyToMany(cascade=CascadeType.ALL)
	private Set<Movies> movies= new HashSet<Movies>();
	public Actors() {
		
	}
	
	public Actors(String actorName, int age, String maritalStatus) {
		super();
		this.actorName = actorName;
		this.age = age;
		this.maritalStatus = maritalStatus;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getActorName() {
		return actorName;
	}
	public void setActorName(String actorName) {
		this.actorName = actorName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public Set<Movies> getMovies() {
		return movies;
	}
	public void setMovies(Set<Movies> movies) {
		this.movies = movies;
	}
	
	
}
