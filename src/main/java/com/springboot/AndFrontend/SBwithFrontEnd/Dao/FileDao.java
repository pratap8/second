package com.springboot.AndFrontend.SBwithFrontEnd.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.springboot.AndFrontend.SBwithFrontEnd.model.FileEntity;

public interface FileDao extends CrudRepository<FileEntity, Integer>{
	
	public List<FileEntity> findByItem(String item);
	
	@Query("SELECT e FROM first e WHERE e.Ranker >= :Ranker")
    public List<FileEntity> listItemsWithPriceOver(@Param("Ranker") int Ranker);
}
