package com.hotelevent;

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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="hotel_list")
public class Hotel {

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		@Column(name="hotel_name")
		private String hotelName;
		@Column(name="location")
		private String location;
		@ManyToMany(cascade=CascadeType.ALL)
		@JoinTable(name="hotel_event_relation",
					joinColumns= {@JoinColumn(name="hotel_id")},
					inverseJoinColumns= {@JoinColumn(name="event_id")}
				)
		private Set<Event> events = new HashSet<>();
		public Hotel() {
			
		}
		public Hotel(String hotelName, String location) {
			
			this.hotelName = hotelName;
			this.location = location;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getHotelName() {
			return hotelName;
		}
		public void setHotelName(String hotelName) {
			this.hotelName = hotelName;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public Set<Event> getEvents() {
			return events;
		}
		public void setEvents(Set<Event> events) {
			this.events = events;
		}
		
		
		
}
