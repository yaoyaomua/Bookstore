package com.bookstore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class ShippingAddress {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String ShippingAddressName;
	private String ShippingAddressStreet1;
	private String ShippingAddressStreet2;
	private String ShippingAddressCity;
	private String ShippingAddressCounty;
	private String ShippingAddressCountry;
	private String ShippingAddressZipcode;
	
	public ShippingAddress() {}
	
	@OneToOne
	private Order order;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getShippingAddressName() {
		return ShippingAddressName;
	}

	public void setShippingAddressName(String ShippingAddressName) {
		this.ShippingAddressName = ShippingAddressName;
	}

	public String getShippingAddressStreet1() {
		return ShippingAddressStreet1;
	}

	public void setShippingAddressStreet1(String ShippingAddressStreet1) {
		this.ShippingAddressStreet1 = ShippingAddressStreet1;
	}

	public String getShippingAddressStreet2() {
		return ShippingAddressStreet2;
	}

	public void setShippingAddressStreet2(String ShippingAddressStreet2) {
		this.ShippingAddressStreet2 = ShippingAddressStreet2;
	}

	public String getShippingAddressCity() {
		return ShippingAddressCity;
	}

	public void setShippingAddressCity(String ShippingAddressCity) {
		this.ShippingAddressCity = ShippingAddressCity;
	}

	public String getShippingAddressCounty() {
		return ShippingAddressCounty;
	}

	public void setShippingAddressCounty(String ShippingAddressCounty) {
		this.ShippingAddressCounty = ShippingAddressCounty;
	}

	public String getShippingAddressCountry() {
		return ShippingAddressCountry;
	}

	public void setShippingAddressCountry(String ShippingAddressCountry) {
		this.ShippingAddressCountry = ShippingAddressCountry;
	}

	public String getShippingAddressZipcode() {
		return ShippingAddressZipcode;
	}

	public void setShippingAddressZipcode(String ShippingAddressZipcode) {
		this.ShippingAddressZipcode = ShippingAddressZipcode;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	
}
