package main.entities;

import java.io.Serializable;
import lombok.Data;

@Data
public class Category implements Serializable {

	private static final long serialVersionUID = 1695425293944084564L;
	
	private Integer cate_id;
	private String name;
	
	public Category() {
		super();
	}

	public Category(Integer cate_id, String name) {
		super();
		this.cate_id = cate_id;
		this.name = name;
	}
}