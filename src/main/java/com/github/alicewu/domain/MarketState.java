package com.github.alicewu.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
public class MarketState implements BaseObject {

	@Id
	private int year;
	private String year1Event;
	private String year2Event;
	private int duration;

	public MarketState() {
	}

	public MarketState(int year, String year1Event, String year2Event, int duration) {
		this.year = year;
		this.year1Event = year1Event;
		this.year2Event = year2Event;
		this.duration = duration;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getYear1Event() {
		return year1Event;
	}

	public void setYear1Event(String year1Event) {
		this.year1Event = year1Event;
	}

	public String getYear2Event() {
		return year2Event;
	}

	public void setYear2Event(String year2Event) {
		this.year2Event = year2Event;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
	}

}
