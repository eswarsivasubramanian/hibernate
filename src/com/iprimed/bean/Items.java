package com.iprimed.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Items {
	
	@Id
	
	@Column(name="item_id")
	private int itemId;
	
	@Column(name="item_total")
	private int itemTotal;
	
	@Column(name="item_quantity")
	private int itemQuantity;
	
	@ManyToOne
	@JoinColumn(name="cart_id")
	private Cart cart;
	
	//constructors
	
	public Items() {}
	
	
	public Items(int itemId, int itemTotal, int itemQuantity, Cart cart) {
		//super();
		this.itemId = itemId;
		this.itemTotal = itemTotal;
		this.itemQuantity = itemQuantity;
		this.cart=cart;
	}


	//getters and setters
	

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getItemTotal() {
		return itemTotal;
	}

	public void setItemTotal(int itemTotal) {
		this.itemTotal = itemTotal;
	}

	public int getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}


	public Cart getCart() {
		return cart;
	}


	public void setCart(Cart cart) {
		this.cart = cart;
	}


	
	
	
	
	

}
