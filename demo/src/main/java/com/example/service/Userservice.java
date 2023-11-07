package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Allpolicy;
import com.example.entity.User;
import com.example.entity.vechilethirdpary;
import com.example.entity.vechilethirdpary.vechileentityfirstparty;
import com.example.repository.Userrepositary;
import com.example.repository.firstpartyrepository;
import com.example.repository.vechilethirdparty;

import java.util.ArrayList;
import java.util.List;

@Service
public class Userservice {
	
	@Autowired
	private firstpartyrepository first;
	
	@Autowired
	private vechilethirdparty thirdparty;
	
	@Autowired
	private Userrepositary repo;
	
	/*public List<Allpolicy> allpolicy(){
		
		Allpolicy al=new Allpolicy();
		al.setFirstparty(first.findAll());
		al.setThirdparty(thirdparty.findAll());
		
		return re;
	}*/
	
	public List<vechileentityfirstparty> firstparty(String name){
		return first.findByvechilename(name);
	}
    
	public List<vechilethirdpary> thirparty(String name){
		return thirdparty.findByvechilename(name);
	}
}
