package com.capgemini.hibernateapp.dto;

import javax.persistence.*;

@Entity
@Table(name = "Movie")
public class Movie {
	@Id
	@Column(name = "movie_id")
	private int mid;
	@Column(name = "movie_name")
	private String mname;
	@Column(name = "rating")
	private String rating;

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getMname() {
		return mname; 
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}
}
