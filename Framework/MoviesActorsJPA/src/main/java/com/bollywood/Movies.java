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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="movies_list")
public class Movies {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="movie_name")
	private String movieName;
	@Column(name="director")
	private String director;
	@Column(name="imdb_rating")
	private double imdbRating;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="movie_actor_relation",
				joinColumns= {@JoinColumn(name="movie_id")},
				inverseJoinColumns= {@JoinColumn(name="actor_id")})
	private Set<Actors> actors= new HashSet<Actors>();
	public Movies() {
		
	}
	public Movies(String movieName, String director, double imdbRating) {
		
		this.movieName = movieName;
		this.director = director;
		this.imdbRating = imdbRating;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public double getImdbRating() {
		return imdbRating;
	}
	public void setImdbRating(double imdbRating) {
		this.imdbRating = imdbRating;
	}
	public Set<Actors> getActors() {
		return actors;
	}
	public void setActors(Set<Actors> actors) {
		this.actors = actors;
	}
	
	
	
}
