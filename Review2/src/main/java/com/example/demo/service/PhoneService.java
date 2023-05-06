package com.example.demo.service;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Phone;
import com.example.demo.repository.PhoneRep;

@Service
public class PhoneService {
	@Autowired
	private PhoneRep phonerep;

	public Phone Post(Phone phone)
	{
		return phonerep.save(phone);
	}
	public List<Phone> getAll()
	{
		return phonerep.findAll();	
	}
	public Phone Update(Phone phone)
	{
		return phonerep.save(phone);
	}
	public void Delete(int rollno)
	{
		phonerep.deleteById(rollno);
	}
	public List<Phone> pagingAndSortingEmployee(int offset,int phone,String field)
	{
		Pageable paging=PageRequest.of(offset, phone).withSort(Sort.by(Sort.Direction.DESC,field));
		Page<Phone> ph=phonerep.findAll(paging);
		
	    return ph.getContent();
		
	}
	public List<Phone> getPage(int offset,int phone)
	{
		Pageable paging=PageRequest.of(offset, phone);
		Page<Phone> Phe=phonerep.findAll(paging);
		return Phe.getContent();
	}
	public List<Phone> getbySort(String field)
	{
		return phonerep.findAll(Sort.by(field));
	}
	
}
