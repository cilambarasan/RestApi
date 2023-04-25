package com.example.demo.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
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

}
