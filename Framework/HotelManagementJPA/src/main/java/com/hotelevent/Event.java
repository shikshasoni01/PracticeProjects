package com.hotelevent;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="event_list")
public class Event {
	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		@Column(name="event_name")
		private String eventName;
		@Column(name="date")
		private String date;
		@ManyToMany(cascade=CascadeType.ALL)
		private Set<Hotel> movies= new HashSet<>();
		public Event() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Event(String eventName, String date) {
			super();
			this.eventName = eventName;
			this.date = date;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getEventName() {
			return eventName;
		}
		public void setEventName(String eventName) {
			this.eventName = eventName;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public Set<Hotel> getMovies() {
			return movies;
		}
		public void setMovies(Set<Hotel> movies) {
			this.movies = movies;
		}
		
		
		
}
