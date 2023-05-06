package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.repository.ServiceRep;

import com.example.demo.model.Service;

@RestController
public class ServiceController {
	@Autowired
	ServiceRep servicerep;
	@GetMapping("/ser/get/{n1}")
	public List<Service> getD(@PathVariable int n1)
	{
		return servicerep.getD(n1);
	}
	@DeleteMapping("/ser/del/{n1}")
	public String del(@PathVariable int n1)
	{
		servicerep.deleteById(n1);
		return "Successfully Deleted";
	}
	@PutMapping("/ser/put/{n1}/{n2}")
	public String update(@PathVariable String n1,@PathVariable int n2)
	{
		servicerep.update(n1, n2);
		return "Updated Successfully";
	}

}
