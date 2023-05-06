package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Phone {
	@Id
	private int customerno;
	
	private String phonemodel;
	private String service;
	private String phoneno;
	private String alternatephoneno;
	private String mailid;
	private String address;
	private String servicebookingdate;
	
	
	
	
	
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getAlternatephoneno() {
		return alternatephoneno;
	}
	public void setAlternatephoneno(String alternatephoneno) {
		this.alternatephoneno = alternatephoneno;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getServicebookingdate() {
		return servicebookingdate;
	}
	public void setServicebookingdate(String servicebookingdate) {
		this.servicebookingdate = servicebookingdate;
	}
	
	public String getPhonemodel() {
		return phonemodel;
	}
	public void setPhonemodel(String phonemodel) {
		this.phonemodel = phonemodel;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public int getCustomerno() {
		return customerno;
	}
	public void setCustomerno(int customerno) {
		this.customerno = customerno;
	}

}
