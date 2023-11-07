package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.vechileentityfirstparty;

@Repository
public interface firstpartyrepository extends JpaRepository<vechileentityfirstparty,Long>{

	
	List<com.example.entity.vechilethirdpary.vechileentityfirstparty> findByvechilename(String name);

}
