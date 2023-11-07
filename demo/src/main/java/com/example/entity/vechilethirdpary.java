package com.example.entity;

import java.util.TreeMap;

import javax.persistence.Entity;
import javax.persistence.Id;

public class vechilethirdpary {

	@Entity
	public class vechileentityfirstparty {
        
		@Id
	    private Long id; 
		
		private String Vechiletype;
		
		private String vechilename;
		
		private TreeMap<String,Integer> firstparty;
		
	}

}
