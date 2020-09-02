package main.entities;

import java.io.Serializable;
import lombok.Data;

@Data
public class CartItem implements Serializable{
	private static final long serialVersionUID = -3936930266896413354L;
	
	private String id;
	private Integer quantity;
	private long unitPrice;
	private Product product;
	private Cart cart;
	
	public CartItem() {
		super();
	}

	public CartItem(String id, Integer quantity, long unitPrice, Product product, Cart cart) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.product = product;
		this.cart = cart;
	}
}
