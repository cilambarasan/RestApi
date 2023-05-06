package com.example.demo.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Service;

import jakarta.transaction.Transactional;

@Repository
public interface ServiceRep extends JpaRepository<Service,Integer> {
	@Query
	(value="select * from Service where genid=?1", nativeQuery = true)
	public List<Service> getD(@Param("qno")int qno);
	@Modifying
	@Transactional
	@Query(value="delete from Service where genid=?1",nativeQuery=true)
	Integer deleteById(@Param("qno") int pno);
	@Modifying
	@Transactional
	@Query(value="update Service set servicetype =?1 where genid =?2",nativeQuery=true)
	public void  update(@Param("qno") String sno,@Param("qname") int company);

     
}
