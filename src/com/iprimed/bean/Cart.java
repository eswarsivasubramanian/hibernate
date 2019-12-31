package com.iprimed.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cart {
	
	@Id
	@Column(name="cart_id")
	private int cartId;
	
	@Column(name="cart_total")
	private int cartTotal;
	
	@Column(name="cart_name")
	private String cartName;
	
	@OneToMany(targetEntity=Items.class,
			mappedBy="cart",
			cascade=CascadeType.ALL,
			fetch=FetchType.LAZY)
	private List<Items> items = new ArrayList<Items>();
	
	//constructors
	
	
	public Cart() {}

	

	public Cart(int cartId, int cartTotal, String cartName, List<Items> items) {
		super();
		this.cartId = cartId;
		this.cartTotal = cartTotal;
		this.cartName = cartName;
		this.items = items;
	}



	//getters and setters
	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getCartTotal() {
		return cartTotal;
	}

	public void setCartTotal(int cartTotal) {
		this.cartTotal = cartTotal;
	}

	public String getCartName() {
		return cartName;
	}

	public void setCartName(String cartName) {
		this.cartName = cartName;
	}



	public List<Items> getItems() {
		return items;
	}



	public void setItems(List<Items> items) {
		this.items = items;
	}

	
	
	

}
