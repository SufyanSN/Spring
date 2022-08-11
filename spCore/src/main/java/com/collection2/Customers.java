package com.collection2;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Customers {
	private String name;
	private List<String> contacts;
	private Set<String> addresses;
	private Map<String, String> products;
	private Properties properties;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getContacts() {
		return contacts;
	}
	public void setContacts(List<String> contacts) {
		this.contacts = contacts;
	}
	public Set<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	public Map<String, String> getProducts() {
		return products;
	}
	public void setProducts(Map<String, String> products) {
		this.products = products;
	}
	
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	
	@Override
	public String toString() {
		return "Customers [name=" + name + ", contacts=" + contacts + ", addresses=" + addresses + ", products="
				+ products + ", properties=" + properties + "]";
	}
	
}

