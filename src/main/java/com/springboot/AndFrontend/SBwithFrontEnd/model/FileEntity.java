package com.springboot.AndFrontend.SBwithFrontEnd.model;

import java.beans.JavaBean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Primary;

@Entity
public class FileEntity {

	@Id
	int id;

	private String Name;

	private int Ranker;

	public FileEntity(int id, String name, int ranker) {
		super();
		this.id = id;
		Name = name;
		Ranker = ranker;
	}

	@Override
	public String toString() {
		return "FileEntity [id=" + id + ", Name=" + Name + ", Ranker=" + Ranker + "]";
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
