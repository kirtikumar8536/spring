package com.springcore.collection;

import java.util.*;

public class Empl {
	private String name;
	private List<String> phone;
	private Set<String> addresses;
	private Map<String, String> courses;

	public Empl(String name, List<String> phone, Set<String> addresses, Map<String, String> courses) {
		super();
		this.name = name;
		this.phone = phone;
		this.addresses = addresses;
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Empl [name=" + name + ", phone=" + phone + ", addresses=" + addresses + ", courses=" + courses + "]";
	}

	public Empl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhone() {
		return phone;
	}

	public void setPhone(List<String> phone) {
		this.phone = phone;
	}

	public Set<String> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

}
