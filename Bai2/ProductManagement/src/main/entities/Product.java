package main.entities;

import java.io.Serializable;
import lombok.Data;

@Data
public class Product implements Serializable {
	private static final long serialVersionUID = -986066630399115578L;
	
	private Integer id;
	private String name;
	private float price;
	private String description;
	private String image;
	private Category category;//cate_id

	public Product() {
		super();
	}

	public Product(Integer id, String name, float price, String description, String image, Category category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
		this.image = image;
		this.category = category;
	}
}
