package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.vechilethirdpary;

@Repository
public interface vechilethirdparty extends JpaRepository<vechilethirdparty, Long>{


	

	List<vechilethirdpary> findByvechilename(String name);

}
