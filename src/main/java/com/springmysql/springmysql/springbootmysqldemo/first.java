package com.springmysql.springmysql.springbootmysqldemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class first {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Name;
    private int Ranker;
	public first(int id, String name, int ranker) {
		super();
		this.id = id;
		Name = name;
		Ranker = ranker;
	}
	public first() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRanker() {
		return Ranker;
	}
	public void setRanker(int ranker) {
		Ranker = ranker;
	}
    
    

   
}
