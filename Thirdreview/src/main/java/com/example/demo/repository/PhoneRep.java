package com.example.demo.repository;

import java.util.List;




import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Phone;
@Repository
public interface PhoneRep extends JpaRepository<Phone,Integer> {
	
	@Query(value="Select * from Phone",nativeQuery=true)
	 List<Phone> get();
	
	
	
	
	
	
	
 

}
